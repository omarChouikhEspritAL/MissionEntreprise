FROM openjdk:17-jdk-slim
COPY target/Foyer-1.4.0.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
