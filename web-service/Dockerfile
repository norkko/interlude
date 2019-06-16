FROM openjdk:8-jdk-alpine
MAINTAINER August

ADD target/web-service.jar /interlude/app.jar
CMD ["java", "-Xmx200m", "-jar", "/interlude/app.jar"]

EXPOSE 4000