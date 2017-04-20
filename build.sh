#!/usr/bin/env bash

cd account-service && \
mvn clean package docker:build && \
cd - && \
cd order-service && \
mvn clean package docker:build && \
cd - && \
docker tag thoughtworkers/account-service localhost:5000/account-service && \
docker push localhost:5000/account-service && \
docker tag thoughtworkers/order-service localhost:5000/order-service && \
docker push localhost:5000/order-service
