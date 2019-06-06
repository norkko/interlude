FROM openjdk:8-jdk-alpine

MAINTAINER August
VOLUME /tmp

ADD "target/server-two-1.0-SNAPSHOT.jar" app.jar
ENTRYPOINT [ "sh", "-c", "java -jar /app.jar" ]