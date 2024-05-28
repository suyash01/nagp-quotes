# Use an official OpenJDK image from the Docker Hub as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the application's JAR file to the container
COPY target/quotes-0.0.1-SNAPSHOT.jar /app/quotes-0.0.1-SNAPSHOT.jar

# Expose the port that your application will run on
# Make sure this matches the port your Spring Boot application is configured to run on
EXPOSE 8080

# Define the command to run the application
ENTRYPOINT ["java", "-jar", "/app/quotes-0.0.1-SNAPSHOT.jar"]
