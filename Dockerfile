FROM openjdk:11
VOLUME /tmp
ADD target/tu-aplicacion.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
