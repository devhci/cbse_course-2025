# Spring Boot MVC with Security

## Description
This is a simple Spring Boot MVC application that provides a REST API to manage users, with **Spring Security** enabled.  
It uses:
- **Spring Boot Web** for building the REST API.
- **Spring Boot Data JPA** for interacting with the database.
- **H2 Database** for an in-memory database.
- **Spring Security** for authentication and authorization.

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
| Method | Endpoint | Description | Security |
|--------|---------|-------------|------------|
| GET | `/users` | Retrieves all users | Requires Authentication |
| POST | `/users` | Creates a new user (send JSON `{ "name": "John Doe" }`) | Requires Authentication |

## Authentication
- The API is protected with **Basic Authentication**.
- Default username/password:
  - **Username:** `admin`
  - **Password:** `password`
- To access protected endpoints, use:
  ```sh
  curl -u admin:password http://localhost:8080/users
  ```

## Database Access
H2 Console is available at:  
[http://localhost:8080/h2-console](http://localhost:8080/h2-console)  
Use JDBC URL: `jdbc:h2:mem:testdb`

## Security Configuration
- The API endpoints are protected with **Basic Authentication**.
- Default user credentials are stored **in-memory**.
- To modify users, update `SecurityConfig.java`.

## Customization
- To change **username/password**, modify `SecurityConfig.java`:
  ```java
  UserDetails user = User.withDefaultPasswordEncoder()
      .username("newuser")
      .password("newpassword")
      .roles("USER")
      .build();
  ```

---

Now your **Spring Boot application** is secured with **Basic Authentication**! 🚀
