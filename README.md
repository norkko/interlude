# Interlude
Interlude is a project mainly playing around with the microservice architecture pattern using Spring Boot in Java.

## Project Layout
* [Discovery Service](https://github.com/august-norkko/interlude/tree/master/eureka) - Eureka discovery service
* [Gateway Service](https://github.com/august-norkko/interlude/tree/master/zuul) - Zuul gateway for routing traffic
* [Account](https://github.com/august-norkko/interlude/tree/master/account) 
* [tbd](https://github.com/august-norkko/interlude/tree/master/tbd) 
* ...

## Requirements
* Java 8
* Docker

## Usage
Each microservice is built as a container. In order to start the application you can run them simultaneously with docker-compose. Before however you need to package all of the microservices.

```
mvn package
docker-compose up
```

---
### License
MIT