FROM openjdk:8
 ADD target/*.jar Spring-docker.jar
 EXPOSE 8000
ENTRYPOINT ["java","-jar","Spring-docker.jar"]
