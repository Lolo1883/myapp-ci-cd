FROM openjdk:17-jdk-slim
COPY target/app-cicd-0.0.1-SNAPSHOT.jar demo.jar

#Install curl
RUN apt-get update && apt-get install -y curl
RUN echo "$JIRA_USERNAME:$JIRA_URL"

ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=local", "demo.jar"]