FROM openjdk:17-jdk-slim
RUN mkdir -p /app/
ADD build/libs/SGC_udea-0.0.1-SNAPSHOT.jar /app/SGC_udea-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/app/SGC_udea-0.0.1-SNAPSHOT.jar"]