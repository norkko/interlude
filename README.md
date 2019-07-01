# Interlude
Interlude is a project mainly playing around with the microservice architecture pattern using Spring Boot in Java

## Project Layout
* [Discovery Service]() - Eureka discovery service
* [Gateway Service]() - Zuul gateway for routing traffic
* [Web Service]() - Serves static content
* [Item Service]() 
* [tbd]() 
* more

## Requirements
* Java 8
* Docker
* Maven

## Running application
Run with docker-dub images
```bash
docker-compose up
```
Build with source, `docker-compose.dev.yaml` inherits configuration from `docker-compose.yaml`
```bash
mvn package

docker-compose -f docker-compose.yaml -f docker-compose.dev.yaml up
```

## Todos
* Auth service (OAuth)
* Kubernetes deployment
* Maybe use a config service

### License
MIT