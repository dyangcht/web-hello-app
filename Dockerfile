FROM registry.redhat.io/ubi8/openjdk-11
USER 1000
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
