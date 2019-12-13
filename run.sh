#!/bin/bash

for d in *; do
	if [ -d ${d} ]; then
		echo removing target from $d
		rm -rf -f ./target
	fi
done

./mvnw package
if [[ "$?" -ne 0 ]] ; then
  echo 'mvn package failed'
  exit $rc
else
  yes Y |docker-compose rm
  docker-compose up --force-recreate --build
fi