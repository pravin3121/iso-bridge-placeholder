FROM openjdk:8
ADD target/iso-bridge-placeholder-0.0.1-jar-with-dependencies.jar iso-bridge-placeholder-0.0.1-jar-with-dependencies.jar
EXPOSE 8086
ENTRYPOINT ["java", "-jar", "iso-bridge-placeholder-0.0.1-jar-with-dependencies.jar"]