# Interlude
Interlude is a project mainly playing around with the microservice architecture pattern using Spring Boot in Java.

## Project Layout
* [Discovery Service](https://github.com/august-norkko/interlude/tree/master/eureka) - Eureka discovery service
* [Gateway Service](https://github.com/august-norkko/interlude/tree/master/zuul) - Zuul gateway for routing traffic
* [Web Service]() - Serves static content
* [Item Service](https://github.com/august-norkko/interlude/tree/master/item-service) 
* [tbd](https://github.com/august-norkko/interlude/tree/master/tbd) 
* ...

## Requirements
* Java 8
* Docker
* Maven

## Usage
Each microservice is built as a container. In order to start the application you can run them simultaneously with docker-compose. Before however you need to package all of the microservices.

```
mvn package
docker-compose up
```

## Todos
* Auth service (OAuth)

* ...

### License
MIT