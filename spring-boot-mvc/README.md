# Spring Boot MVC Example

## Description
This is a simple Spring Boot MVC application that provides a REST API to manage users. It uses:
- **Spring Boot Web** for building the REST API.
- **Spring Boot Data JPA** for interacting with the database.
- **H2 Database** for an in-memory database.

## How to Run
1. Ensure you have **Java 17+** and **Maven** installed.
2. Clone or unzip this project.
3. Navigate to the project directory.
4. Run the application:
   ```sh
   mvn spring-boot:run
   ```
5. The API will be available at: `http://localhost:8080/users`.

## API Endpoints
| Method | Endpoint | Description |
|--------|---------|-------------|
| GET | `/users` | Retrieves all users |
| POST | `/users` | Creates a new user (send JSON `{ "name": "John Doe" }`) |

## Database Access
H2 Console is available at:  
[http://localhost:8080/h2-console](http://localhost:8080/h2-console)  
Use JDBC URL: `jdbc:h2:mem:testdb`


### Custom Mysql DB-- change the application.properties file in resource folder with

```xml
# MySQL Database Configuration
spring.datasource.url=jdbc:mysql://<YOUR_HOST>:3306/<YOUR_DATABASE>?useSSL=false&serverTimezone=UTC
spring.datasource.username=<YOUR_USERNAME>
spring.datasource.password=<YOUR_PASSWORD>
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# Hibernate Properties
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
spring.jpa.hibernate.ddl-auto=update  # Use 'update' for automatic schema changes

# Show SQL in logs (optional)
spring.jpa.show-sql=true
```