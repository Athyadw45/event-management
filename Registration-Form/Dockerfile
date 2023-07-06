FROM openjdk:17-alpine
LABEL maintainer="Rigel Indians"
RUN mkdir App
ADD target/Saitamaspringboot-0.0.1-SNAPSHOT.jar App/springapp.jar
ENTRYPOINT [ "java", "-jar", "App/springapp.jar"]