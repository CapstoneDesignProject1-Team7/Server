FROM openjdk:8-jdk-alpine

LABEL maintainer="cube9928@knu.ac.kr"

VOLUME /tmp
ARG JAR_FILE=build/libs/schoolzone-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} to-do-schoolzone.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/to-do-schoolzone.jar"]