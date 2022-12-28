FROM maven:3.6.0-jdk-11
ADD target/user-management.jar user-management.jar
ENTRYPOINT ["java", "-jar", "user-management.jar"]

RUN mvn clean install
CMD mvn spring-boot:run