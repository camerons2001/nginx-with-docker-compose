FROM openjdk
COPY /target/hello-service-0.0.1-SNAPSHOT.jar hello-service-0.0.1-SNAPSHOT.jar
EXPOSE 8081:8081
ENTRYPOINT ["java", "-jar", "hello-service-0.0.1-SNAPSHOT.jar"]