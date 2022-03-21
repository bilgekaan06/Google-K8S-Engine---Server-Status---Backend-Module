# Dockerize the Spring Boot Application

* All following commands were run on Ubuntu OS.
* ## Prerequisites
* Firstly, backup all project directory.
```
zip -r backend-app.zip backend-app/
```
* Change the current working directory to backend-app, then to obtain the maven artifact of the application, run the following command:
```
mvn clean && mvn package -DskipTests
```
* Move the maven artifact to where Dockerfile is located and rename as used in Dockerfile. To access the file, I used click [Dockerfile](https://github.com/bilgekaan06/Google-K8S-Engine-Server-Status-Backend-Module/blob/main/Dockerfile)
```
mv ./target/backend-0.0.1-SNAPSHOT.jar ./rest-service.jar
```
## Build the Docker Image
```
docker build -t apismellifica/spring-boot-enpoint:1.2 .
docker build -t europe-central2-docker.pkg.dev/cyangate/task-repo/spring-boot-enpoint:1.2 .
```
* Example: docker build -t myreponame:projectname:tag [docker build](https://docs.docker.com/engine/reference/commandline/build/)
## Push the Image to Docker Hub and Google Cloud Artifact Registry
```
docker push apismellifica/spring-boot-enpoint:1.2
docker push europe-central2-docker.pkg.dev/cyangate/task-repo/spring-boot-enpoint:1.2
```
* Example: docker push registryhost [docker push](https://docs.docker.com/engine/reference/commandline/push/)
