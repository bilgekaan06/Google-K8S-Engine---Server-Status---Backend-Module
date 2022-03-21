FROM openjdk:11.0.10-jdk-slim

WORKDIR /
COPY rest-service.jar rest-service.jar
RUN ln -snf /usr/share/zoneinfo/Europe/Istanbul /etc/localtime
ENTRYPOINT ["java","-jar","/rest-service.jar"]
