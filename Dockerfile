FROM openjdk:8
ADD target/phase.jar phase.jar
EXPOSE 8089
ENTRYPOINT ["java","-jar","phase.jar"]
