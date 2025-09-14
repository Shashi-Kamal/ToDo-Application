# ToDo-Application
A simple Todo management app built with Spring Boot to explore backend development, database communication, and server-side rendering using Thymeleaf. This project was created as a hands-on learning experience and serves as a foundation for future enhancements like Docker deployment.

## Purpose

This app was developed to:
- Understand the basics of Spring Boot
- Learn how to connect and interact with a database using JPA
- Explore Thymeleaf for dynamic HTML rendering
- Prepare for containerization using Docker

## Tech Stack

| Technology     | Role                                 |
|----------------|--------------------------------------|
| Java + Spring Boot | Backend framework                 |
| Thymeleaf      | Server-side HTML templating           |
| JPA + Hibernate| ORM and database interaction          |
| H2 / MySQL     | Database (depending on setup)         |
| Docker         | (Planned) Containerization            |

## Features

- Add, edit, delete, and view todos
- Mark tasks as completed
- Dynamic UI rendered with Thymeleaf
- Persistent storage using JPA
- Clean MVC architecture

## Project Structure
src/ ├── main/ │ ├── java/ │ │ └── com.todoapp/ │ │ ├── controller/ │ │ ├── service/ │ │ ├── model/ │ │ └── repository/ │ └── resources/ │ ├── templates/ # Thymeleaf HTML files │ ├── static/ # CSS/JS assets │ └── application.yml └── test/


## Setup Instructions

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/todo-application.git
   cd todo-application
   ```
2. Configure your database in application.properties. You can use H2 for quick testing or MySQL/PostgreSQL for production.

3. Run the application:
```
mvn spring-boot:run
```
4. Open your browser and visit:
   ttp://localhost:8080/tasks

## Docker Integration (Planned)
- Wish to implement Docker
