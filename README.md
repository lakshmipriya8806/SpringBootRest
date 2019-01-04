# SpringBootRest

This application is built using Spring Boot, Hiberante as the JPA implementation and MySQL as the database.
This application contains mainly two Controllers: CountryController and EmployeeController.

The CountryController has RestFul webservices implemented which then communicates with external RestFul webservices via Spring RestTemaplate.

The EmployeeController has RestFul webservices implemented which then communicates with Service layer which implements Spring CrudRepository.
The CrudResposiroy uses Hibernate to communicate with the MySQL database.

This application has Swagger documentation enabled for Restful webservice documentation.

Spring actuator is enabled for getting application info and health details.

Spring security and exception handling is implemented.

Thymeleaf is used as the view layer and Bootstrap is used for the CSS styling.

Logging is enabled and logback is used as the logging framework.

## Sonar Code Quality Report

Please check: https://sonarcloud.io/dashboard?id=lakshmipriya8806_SpringBootRest

## Spring Actuator end points

http://localhost:8080/actuator/health

http://localhost:8080/actuator/info

## Swagger Link
http://localhost:8080/swagger-ui.html

## Spring Security added
userName:user and password:password

## Log enabled

