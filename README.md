
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

```
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogExample {  
}
```
will generate

```
import org.slf4j.Logger;  
import org.slf4j.LoggerFactory;

public class LogExample {  
private static final Logger log = getLogger(LogExample.class);
}
```
