Job Portal Backend

A secure and scalable Job Portal Backend API built using Spring Boot.
This project provides REST APIs for user authentication, job posting, and job application management using JWT-based security.

---

🧠 Features

- 🔐 JWT Authentication & Authorization
- 👤 User Registration & Login
- 🧑‍💼 Recruiter can post jobs
- 📄 Candidates can apply for jobs
- 🗄️ MySQL Database Integration
- 🧩 Spring Data JPA & Hibernate
- 🛡️ Spring Security Configuration
- 📬 RESTful API Design

---

🛠️ Tech Stack

- Backend: Spring Boot, Java
- Security: Spring Security, JWT
- Database: MySQL 8
- ORM: Hibernate / JPA
- Build Tool: Maven
- Testing Tool: Postman

---

📁 Project Structure

jobportal
 ┣ 📂 controller
 ┣ 📂 service
 ┣ 📂 repository
 ┣ 📂 entity
 ┣ 📂 security
 ┣ 📜 application.properties
 ┗ 📜 pom.xml

---

⚙️ Prerequisites

Make sure you have installed:

- Java 17+
- Maven
- MySQL 8
- Postman
- Git

---

🗄️ Database Configuration

Update your "application.properties":

spring.datasource.url=jdbc:mysql://localhost:3306/jobportal
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

✅ Make sure MySQL service is running.

---

▶️ How to Run the Project

1️⃣ Clone the repository

git clone https://github.com/YOUR_USERNAME/job-portal-backend.git
cd job-portal-backend

2️⃣ Build the project

mvn clean install

3️⃣ Run the application

mvn spring-boot:run

Server will start at:

http://localhost:8080

---

🔐 API Endpoints (Sample)

🧑 Auth

Method| Endpoint| Description
POST| "/api/auth/register"| Register user
POST| "/api/auth/login"| Login user

💼 Jobs

Method| Endpoint| Description
POST| "/api/jobs"| Post new job
GET| "/api/jobs"| Get all jobs

📄 Applications

Method| Endpoint| Description
POST| "/api/applications/apply"| Apply for job
GET| "/api/applications/user/{userId}"| Get user applications

---

🧪 Testing with Postman

1. Register user
2. Login and copy JWT token
3. Add token in header:

Authorization: Bearer <your_token>

4. Test protected APIs

---

🚀 Future Improvements

- 🔍 Job search & filtering
- 📧 Email notifications
- 🌐 Frontend integration (React)
- 🐳 Docker support
- 📊 Admin dashboard

---

👨‍💻 Author

Prince Dashrathsingh Kushwaha

If you like this project, give it a ⭐ on GitHub!
