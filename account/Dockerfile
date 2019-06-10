FROM openjdk:8-jdk-alpine
MAINTAINER August

ADD target/account.jar /interlude/app.jar
CMD ["java", "-Xmx200m", "-jar", "/interlude/app.jar"]

EXPOSE 6000