# 🚗 Automobile User Ratings System

This is a web-based system developed using **Spring Boot**, **Thymeleaf**, and **PostgreSQL**. It allows users to register, log in, add automobile details, and submit reviews with ratings.

## ✨ Features

- User registration and login with Spring Security
- Add and manage vehicle information
- Submit and view ratings and reviews for automobiles
- Thymeleaf-based responsive HTML pages
- Secure password storage and session handling

## 🛠️ Technologies Used

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- Spring Security
- Thymeleaf
- PostgreSQL
- Maven

## ⚙️ Setup Instructions

### 🔧 Prerequisites

- Java 17 or later
- Maven
- PostgreSQL
- IDE (e.g., Visual Studio Code or IntelliJ)

### 🚀 Steps to Run

1. **Clone the repository:**
   ```bash
   git clone https://github.com/your-username/automobile-user-ratings-system.git
   cd automobile-user-ratings-system
spring.datasource.url=jdbc:postgresql://localhost:5432/ratingsdb
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

Build and run the project:

_mvn spring-boot:run_

Open in browser:

_http://localhost:8080/_
