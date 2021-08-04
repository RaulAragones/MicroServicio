FROM openjdk:11-jdk-slim
ARG JAR_FILE=target/usuarioPY-0.0.1-SNAPSHOT.jar 
ADD ${JAR_FILE} "usuariosPY.jar"
EXPOSE 9090
ENTRYPOINT ["java","-jar","/usuariosPY.jar"]
