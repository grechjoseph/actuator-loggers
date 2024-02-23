1. Dependency.
```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
```
2. Properties.
```
management.endpoints.web.exposure.include=loggers
```
3. Run the application.
4. Execute this curl to enable TRACE level.
```
curl --location 'http://localhost:8080/actuator/loggers/com.actuatorloggers.demo' \
--header 'Content-Type: application/json' \
--data '{
"configuredLevel":"TRACE"
}'
```

5. Execute this cURL to test the new log level
```
curl --location 'http://localhost:8080/test'
```

6. repeat steps 4-5 for testing.
