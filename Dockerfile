# Use a base image with JDK 17 (or any required version)
FROM eclipse-temurin:21-jre as runtime

# Set the working directory inside the container
WORKDIR /app

# Copy the built application JAR file into the container
COPY build/libs/*.jar app.jar

# Expose the application port (match your Spring Boot app's port)
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "app.jar"]
