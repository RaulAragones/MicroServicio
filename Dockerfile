FROM openjdk:8-jdk-slim
COPY "usuariosMS-0.0.1-SNAPSHOT.jar" "usuariosMS.jar"
EXPOSE 9090
ENTRYPOINT ["java","-jar","usuariosMS.jar"]