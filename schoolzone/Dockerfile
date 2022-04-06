FROM openjdk:8-jdk-alpine

LABEL maintainer="cube9928@knu.ac.kr"

VOLUME /tmp
ARG JAR_FILE=build/libs/schoolzone-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} schoolzone.jar

# for docker hub
COPY ${JAR_FILE} cube9928/schoolzone.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/schoolzone.jar"]