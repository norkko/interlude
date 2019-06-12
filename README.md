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
Each microservice is built as a container. All containers are started simultaneously with docker-compose.
Before running each module has to package, after that docker-compose can be run to boot up all microservices along with databases.

```
# package
mvn package

# start app
docker-compose up

# should be available at:
# http://localhost:8080/
```

## Todos
* Auth service (OAuth)

* idk

### License
MIT