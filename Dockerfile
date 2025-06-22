# Use official lightweight OpenJDK image
FROM openjdk:17-jdk-alpine

# Set working directory inside container
WORKDIR /app

# Copy Maven wrapper and project files
COPY .mvn .mvn
COPY mvnw .
COPY pom.xml .

# Download dependencies
RUN ./mvnw dependency:go-offline -B

# Copy source code
COPY src src

# Package the application
RUN ./mvnw package -DskipTests

# Run the app (replace the jar name below if needed)
CMD ["java", "-jar", "target/*.jar"]

# Expose port 8080
EXPOSE 8080
