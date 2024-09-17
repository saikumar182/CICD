FROM maven:3.8.3-openjdk-17 AS build
COPY . /app
WORKDIR /app
FROM openjdk:17
RUN mkdir app
COPY --from=build /app/target/springbootcicd.jar /app/springbootcicd.jar
CMD ["java", "-jar", "/app/springbootcicd.jar"]

