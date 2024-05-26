FROM eclipse-temurin:21-jdk-alpine

WORKDIR '/app'

# Copy maven and pom
COPY .mvn/ ./.mvn
COPY mvnw pom.xml ./

# Download dependencies
RUN ./mvnw dependency:go-offline

COPY src ./src

CMD ["./mvnw", "spring-boot:run"]