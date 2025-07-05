FROM java-21-openjdk-amd64
COPY target/Foyer-1.4.0.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
