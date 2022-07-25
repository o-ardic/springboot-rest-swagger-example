# Documenting Spring Boot RESTful Services with Swagger UI

This is a sample Spring Boot application to demonstrate how easily it is posible to document Spring Boot RESTful 
services via Swagger UI.

### How to Run
Start the application with the command `mvn spring-boot:run` and navigate to http://localhost:8080/swagger-ui/index.html 
to see the results:

### OpenAPI Documentation
To retrieve OpenAPI documentation, navigate to http://localhost:8080/v3/api-docs. This documentation represents the 
service schema containing request paths, request types, parameter types etc. in JSON format to be able to write clients 
to consume the service. It can also be imported to Postman to generate the client code in plenty of programming 
languages (cURL, Dart, Go, JavaScript, Java, C#, NodeJS, Python, PHP etc.), call the service directly or even generate 
the server code.

### Custom Swagger UI Path
You can customize the path to display Swagger UI page via `springdoc.swagger-ui.path` parameter in `application.yml` as 
follows:

    springdoc:
      swagger-ui:
        path: /api/

Now you can access the test page via http://localhost:8080/api/swagger-ui/index.html.