FROM openjdk:11
COPY ./target/epicTest-0.0.1-SNAPSHOT.jar epicTest-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/epicTest-0.0.1-SNAPSHOT.jar"]