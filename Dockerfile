FROM openjdk:18

COPY ./build/libs/ec-eureka-server-0.0.1-SNAPSHOT.jar ec-eureka-server-0.0.1-SNAPSHOT.jar

CMD ["java", "-jar", "ec-eureka-server-0.0.1-SNAPSHOT.jar"]