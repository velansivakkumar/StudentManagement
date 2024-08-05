# School Management System

This is a simple School Management System built using Spring Boot, Spring Security, and H2 Database.

## Prerequisites

- Java 11 or higher
- Maven
- An IDE such as IntelliJ IDEA, Eclipse, or VS Code

## Project Structure

schoolmanagement
├── src
│ ├── main
│ │ ├── java
│ │ │ └── com
│ │ │ └── techeazy
│ │ │ └── schoolmanagement
│ │ │ ├── SchoolManagementApplication.java
│ │ │ └── SecurityConfig.java
│ │ └── resources
│ │ ├── application.properties
│ │ └── schema.sql
├── pom.xml
└── README.md

sql
Copy code

## Setting Up the Database

The project uses an in-memory H2 database. The database schema is defined in the `schema.sql` file located in the `src/main/resources` directory.

### `schema.sql`

```sql
CREATE TABLE IF NOT EXISTS students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
);

INSERT INTO students (name, email) VALUES ('John Doe', 'john.doe@example.com');
Configuration
The application is configured using the application.properties file located in the src/main/resources directory.

application.properties
properties
Copy code
# Enable H2 console
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# Configure H2 database
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update
Running the Application
Clone the repository:

sh
Copy code
git clone <repository-url>
cd schoolmanagement
Build the project:

sh
Copy code
mvn clean install
Run the application:

sh
Copy code
mvn spring-boot:run
Access the application:

Open your web browser and go to http://localhost:8080/h2-console to access the H2 console. Use the configured credentials to log in (e.g., sa / password).
You should be prompted to log in with the user credentials defined in your SecurityConfig (e.g., user / password) when accessing other endpoints.
