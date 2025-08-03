FROM openjdk:8 as builder
RUN mvnw -Dmaven.test.skip=true clean package
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
