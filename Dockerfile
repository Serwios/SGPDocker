# Use a base image with Java pre-installed
FROM maven:3.8.4-openjdk-17-slim AS build

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled Spring Boot application JAR file into the container
COPY target/demo-0.0.1-SNAPSHOT.jar /app/your-application.jar

# Expose port 8080 to the outside world
EXPOSE 8080

# Command to run the Spring Boot application when the container starts
CMD ["java", "-jar", "your-application.jar"]
