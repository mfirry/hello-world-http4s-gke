FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
COPY target/scala-3.3.0/hello-world-assembly-0.1.0-SNAPSHOT.jar /app/hello-world.jar
ENTRYPOINT ["java", "-jar", "hello-world.jar"]