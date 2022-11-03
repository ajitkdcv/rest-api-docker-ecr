FROM openjdk:8
 ADD target/*.jar Spring-docker.jar
 EXPOSE 8080
ENTRYPOINT ["java","-jar","Spring-docker.jar"]
