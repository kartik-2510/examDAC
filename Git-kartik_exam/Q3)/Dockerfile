# Use an OpenJDK base image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the Java source code into the container
COPY OddNumbers.java .

# Compile the Java program
RUN javac OddNumbers.java

# Set the default command to run the compiled Java program
CMD ["java", "OddNumbers"]
