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

## Installation and deployment

```bash
# Package modules
mvn package

# Deploy with compose
docker-compose up
```

## Endpoints
- [localhost:8080]() Application frontend
- [localhost:8761]() Eureka dashboard

### Rest API
##### Item service
||||
| ---- | -------------------- | ----------------- |
| GET  | localhost:8080/items | fetches all items |
||||
| POST | localhost:8080/items | register a new item |
||||
| DELETE | localhost:8080/items/_id_ | removes a registered item |
||||
| PUT | localhost:8080/items/_id_ | updates a registered item |
||||

##### tbd service

##### ...

## Todos
* Auth service (OAuth)
* Kubernetes deployment

### License
MIT