#!/bin/bash
mvn package
if [[ "$?" -ne 0 ]] ; then
  echo 'mvn package failed'; exit $rc
else
  if [ "$1" ]; then
  	yes Y |docker-compose rm
    docker-compose -f docker-compose.yaml -f docker-compose.dev.yaml up --build
  else 
  	docker-compose -f docker-compose.yaml -f docker-compose.dev.yaml up
  fi
fi