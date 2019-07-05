# docker

intellij

create Dockerfile

FROM openjdk:8
EXPOSE 8080
ADD target/spring-boot-docker.jar spring-boot-docker.jar
ENTRYPOINT ["java","-jar","/spring-boot-docker.jar"]

pom.xml

<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
		<finalName>spring-boot-docker</finalName>
	</build>

maven build install

open docker
restart docker desktop
cd to the project
docker build -t spring-boot-docker.jar .
docker image ls
docker run -p 9090:8080 spring-boot-docker.jar


Spring Boot on Docker connecting to MySQL Docker container

Use MySQL Image published by Docker Hub (https://hub.docker.com/_/mysql/) Command to run the mysql container docker run --name mysql-standalone -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=test -e MYSQL_USER=sa -e MYSQL_PASSWORD=password -d mysql:5.6

In the Spring Boot Application, use the same container name of the mysql instance in the application.properties spring.datasource.url = jdbc:mysql://mysql-standalone:3306/test

Create a Dockerfile for creating a docker image from the Spring Boot Application FROM openjdk:8 ADD target/users-mysql.jar users-mysql.jar EXPOSE 8086 ENTRYPOINT ["java", "-jar", "users-mysql.jar"]

Using the Dockerfile create the Docker image. From the directory of Dockerfile - docker build . -t users-mysql

Run the Docker image (users-mysql) created in #4. docker build . -t users-mysql

Useful Docker commands

docker images
docker container ls
docker logs <container_name>
docker container rm <container_name
docker image rm <image_name
