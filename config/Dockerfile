FROM openjdk:8-jdk-alpine
MAINTAINER August
VOLUME /interlude
ADD target/config.jar /interlude/app.jar
CMD [ "java", "-Xmx200m", "-jar", "/interlude/app.jar" ]

EXPOSE 8888