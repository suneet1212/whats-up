FROM eclipse-temurin:21
RUN mkdir /opt/app
COPY Backend/demo/target/demo-1.0-SNAPSHOT.jar /opt/app
CMD ["java", "-jar", "/opt/app/demo-1.0-SNAPSHOT.jar"]

# https://hub.docker.com/_/eclipse-temurin