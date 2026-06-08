# Lab 8 – Containerization and Kubernetes Deployment

## Student

Leul Getsige

## Objective

The objective of this lab was to containerize a Spring Boot eLibrary web application using Docker and deploy it using Kubernetes with multiple replicas.

## Task 1: Docker Containerization

### Steps Completed

1. Built the Spring Boot application using Maven.
2. Created a Dockerfile for the application.
3. Built a Docker image named `elibrarywebapp`.
4. Created a `docker-compose.yml` file.
5. Started the application and MySQL database containers using Docker Compose.
6. Verified that both containers were running successfully in Docker Desktop.

### Docker Components

* Spring Boot Web Application Container
* MySQL Database Container
* Docker Compose for orchestration

## Task 2: Kubernetes Deployment

### Steps Completed

1. Enabled Kubernetes in Docker Desktop.
2. Pushed the application image to Docker Hub.
3. Created Kubernetes deployment files.
4. Created a MySQL Deployment and Service.
5. Created a Web Application Deployment with 3 replicas.
6. Deployed the application to Kubernetes.
7. Verified that all pods were running successfully.

### Kubernetes Components

* MySQL Deployment (1 Pod)
* MySQL Service
* eLibrary Deployment (3 Pods)
* ReplicaSet managed by Kubernetes

## Verification

### Docker Verification

Docker Desktop showed:

* elibrarywebapp container running
* elibrary-mysql container running

### Kubernetes Verification

Kubernetes showed:

* 3 running eLibrary application pods
* 1 running MySQL pod

### Application Access

The application was successfully accessed through the browser after deployment.

## Screenshots Included

1. Docker Desktop showing running containers.
2. Kubernetes terminal output showing running pods.
3. Browser window showing the deployed eLibrary application.
