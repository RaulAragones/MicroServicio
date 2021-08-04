FROM openjdk:8-jdk-slim
COPY "usuarioPY-0.0.1-SNAPSHOT.jar" "usuarioPY.jar"
EXPOSE 9090
ENTRYPOINT ["java","-jar","usuarioPY.jar"]