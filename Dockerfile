FROM openjdk:11-jdk-slim
ARG JAR_FILE=target/ProyectWebUsuario-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} "ProyectWebUsuario.jar"
EXPOSE 9090
ENTRYPOINT ["java","-jar","/ProyectWebUsuario.jar"]
