#!/bin/bash

# Set variables
IMAGE_NAME="my-spring-boot-app:latest"
DEPLOYMENT_FILE="kube/app-deployment.yaml"
SERVICE_FILE="kube/app-service.yaml"
APP_LABEL="app=spring-boot-app"

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

echo "📦 Docker compose..."
if docker-compose up -d; then
    echo "✅ Docker compose successful"
else
    echo "❌ Deployment failed! Exiting..."
    exit 1
fi

echo "🎉 Deployment completed successfully!"
