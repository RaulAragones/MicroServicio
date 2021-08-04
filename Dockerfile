FROM openjdk:8-jdk-slim
COPY "ProyectWebUsuario-0.0.1-SNAPSHOT.jar" "ProyectWebUsuario.jar"
EXPOSE 9090
ENTRYPOINT ["java","-jar","ProyectWebUsuario.jar"]