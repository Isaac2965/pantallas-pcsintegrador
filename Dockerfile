FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/pantallas-0.0.1-SNAPSHOT.jar pantallas.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","pantallas.jar"]
