
# SpringBoot Series

### Create and Initialize a Spring Boot project
https://hellokoding.com/create-a-new-spring-boot-project/

### Lombok
Lombok is a Java library that can plug into editors and build tools to generate boilerplate code when defining Java classes (such as constructors, field getter and setter, equals and hashCode methods) at compile time for you via annotations

- Add Lombok to your project in dependencies.

#### Construction Related Injections
- @NoArgsConstructor
- @RequiredArgsConstructor
- @AllArgsConstructor

#### Encapsulation Related Annotations
- @Getter
- @Setter
- @ToString
- @EqualsAndHashCode

- @Data (Combination of @Getter + @Setter + @RequiredArgsConstructor + @ToString + @EqualsAndHashCode)
- @Value (Combination of @Getter + @FieldDefaults(makeFinal=true, level=AccessLevel.PRIVATE) + @AllArgsConstructor + @ToString + @EqualsAndHashCode)

#### Add a Logger with @Slf4j
Use @Slf4j to generate a logger field, make sure slf4j-api is already included in your project dependencies

```bash
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogExample {  
}
```
will generate

```bash
import org.slf4j.Logger;  
import org.slf4j.LoggerFactory;

public class LogExample {  
private static final Logger log = getLogger(LogExample.class);
}
```

### Add Docker

#### Docker Commands

##### To check Docker version:
```bash
docker -v
```

##### To Build Docker Image
Syntax:
```bash
docker build -f PATH_OF_DOCKER_FILE -t TAG_NAME_FOR_DOCKER_IMAGE .
```

Example:
```bash
docker build -f Dockerfile -t user-management .
```

##### To Get List of Docker Images
```bash
docker images
```

## Run the System
We can easily run the whole with only a single command:
```bash
docker-compose up
```

Docker will pull the MySQL and Spring Boot images (if our machine does not have it before).

The services can be run on the background with command:
```bash
docker-compose up -d
```

## Stop the System
Stopping all the running containers is also simple with a single command:
```bash
docker-compose down
```

If you need to stop and remove all containers, networks, and all images used by any service in <em>docker-compose.yml</em> file, use the command:
```bash
docker-compose down --rmi all
```