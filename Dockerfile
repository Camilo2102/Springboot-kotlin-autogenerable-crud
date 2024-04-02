# Build stage
FROM maven:3-openjdk-18 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Package stage
FROM openjdk:18-alpine
WORKDIR /app
COPY --from=build /app/target/auto-generable-crud.jar auto-generable-crud.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","auto-generable-crud.jar"]