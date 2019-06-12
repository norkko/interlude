#!/bin/bash

rm -rf ./eureka/target ./item-service/target ./tbd/target ./zuul/target
mvn package
if [[ "$?" -ne 0 ]] ; then
  echo 'mvn package failed'; exit $rc
else
  if [ "$1" ]; then
  	yes Y |docker-compose rm
  	docker rmi interlude_zuul interlude_tbd interlude_item-service interlude_eureka -f
    docker-compose up --build   
  else 
  	docker-compose up
  fi
fi