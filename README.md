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

