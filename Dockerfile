FROM openjdk:8 as builder
#WORKDIR /home/app
#ADD . /home/app/sp-boot
#RUN cd /home/app/sp-boot && ./mvnw -Dmaven.test.skip=true clean package

ARG JAR_FILE=*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
