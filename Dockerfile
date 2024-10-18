FROM openjdk:17-slim
LABEL maintaier="Aamir"
COPY target/spring-boot-docker-app.jar /usr/app/
WORKDIR /usr/app/
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "spring-boot-docker-app.jar"]
