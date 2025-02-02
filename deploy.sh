#!/bin/bash

# Set variables
IMAGE_NAME="my-spring-boot-app:latest"
DEPLOYMENT_FILE="kube/app-deployment.yaml"
SERVICE_FILE="kube/app-service.yaml"
APP_LABEL="app=spring-boot-app"

echo "🧹 Cleaning up previous Kubernetes resources..."
kubectl delete all -l $APP_LABEL --ignore-not-found
echo "✅ Cleanup completed!"

echo "📦 Cleaning and building JAR file with the 'prod' profile..."
if ./gradlew clean build -x test -Pprod; then
    echo "✅ JAR build successful!"
else
    echo "❌ JAR build failed! Exiting..."
    exit 1
fi

echo "🚀 Building Docker image..."
if docker build -t $IMAGE_NAME .; then
    echo "✅ Docker image built successfully!"
else
    echo "❌ Docker build failed! Exiting..."
    exit 1
fi

echo "📦 Applying Kubernetes Deployment..."
if kubectl apply -f $DEPLOYMENT_FILE; then
    echo "✅ Deployment applied successfully!"
else
    echo "❌ Deployment failed! Exiting..."
    exit 1
fi

echo "🌐 Applying Kubernetes Service..."
if kubectl apply -f $SERVICE_FILE; then
    echo "✅ Service applied successfully!"
else
    echo "❌ Service deployment failed! Exiting..."
    exit 1
fi

echo "🌐 Restarting Kubernetes deployment..."
if kubectl rollout restart deployment spring-boot-app; then
    echo "✅ Deployment restarted successfully!"
else
    echo "❌ Deployment restart failed! Exiting..."
    exit 1
fi



echo "🎉 Deployment completed successfully!"
