#!/bin/bash

rm -rf ./eureka/target ./account/target
mvn package
if [[ "$?" -ne 0 ]] ; then
  echo 'mvn package failed'; exit $rc
else
  if [ "$1" ]; then 
  	yes Y |docker-compose rm
    docker-compose up --build   
  else 
  	docker-compose up
  fi
fi