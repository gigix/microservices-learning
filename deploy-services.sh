#!/usr/bin/env bash

docker service rm `docker service ls -q`
docker service create --name account-service --publish 8081:8080 localhost:5000/account-service && \
docker service create --name order-service --publish 8082:8080 localhost:5000/order-service
