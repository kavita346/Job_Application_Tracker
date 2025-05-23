# 🎯 Job Application Tracker API

A Spring Boot REST API that helps users track job applications, including the company name, position, location, application status, and applied date.

## 💻 Tech Stack
- Java 11
- Spring Boot
- Spring Data JPA
- MySQL
- Postman (for testing)
- STS (Spring Tool Suite)

## 📦 Features
- Add new job applications
- View all applied jobs
- Update job status or details
- Delete job entries

## 📁 Project Structure
com.kavita.jobtracker

├── controller

├── model

├── repository

├── service

└── JobTrackerApplication.java


## 🧪 API Endpoints

| Method | Endpoint               | Description             |
|--------|------------------------|------------------------|
| POST   | `/api/jobs`            | Add a new job          |
| GET    | `/api/jobs`            | Get all jobs           |
| GET    | `/api/jobs/{id}`       | Get job by ID          |
| PUT    | `/api/jobs/{id}`       | Update job             |
| DELETE | `/api/jobs/{id}`       | Delete job             |

## 🔗 Sample JSON for POST
```json
{
  "company": "Infosys",
  "position": "Java Developer",
  "status": "Applied",
  "location": "Pune",
  "appliedDate": "2025-05-23"
}
```
## 📌 How to Run

Clone this repo

Create a MySQL database: jobtracker_db

Update application.properties with DB credentials

Run the app via STS or terminal

## 🙋‍♀️ Author

Kavita Wani – LinkedIn


---

## ✅ 2. **1-Minute Elevator Pitch for Interviews**

Use this when you're asked: “Tell me about your project” or “What have you built?”

### 🎤 Elevator Pitch:
> “I developed a **Job Application Tracker** using **Java, Spring Boot, and MySQL**. It’s a REST API that allows users to track job applications they've submitted, along with details like company, role, status, location, and applied date. I followed a layered architecture — using controllers, services, and JPA repositories — and tested everything with Postman.  
>  
> I built it to improve my backend skills and create a real-world project I can showcase. It's available on GitHub and reflects my ability to write clean, modular Java code, design REST APIs, and work with databases using Spring Data JPA.”

---

## ✅ 3. **Mock Interview Q&A – Practice Script**

### Q1: What is the purpose of your project?
> It's a backend system that tracks job applications. You can add, view, update, or delete job entries, and it's designed to demonstrate real-world CRUD operations.

---

### Q2: What tech stack did you use?
> Java with Spring Boot for the backend, MySQL for the database, and Postman for testing. I used Spring Data JPA to handle database operations.

---

### Q3: How did you structure the application?
> I used the standard 3-layer architecture:
- **Controller** to handle HTTP requests
- **Service** for business logic
- **Repository** for database interaction using `JpaRepository`

---

### Q4: How do you handle "job not found" cases?
> I use `Optional<Job>` in the service layer and throw a custom exception if the ID is not found, which prevents null pointer errors and makes the API more robust.

---

### Q5: What challenges did you face?
> Initially, I got an error due to a mismatched package name in the repository. I learned to keep package structures consistent for Spring Boot's component scanning to work.

---

### Q6: Is this deployed anywhere?
> Currently, it runs locally, but I plan to deploy it on **Render** or **Railway** to make it publicly accessible and include it in my portfolio.

---

## 🚀 You're All Set!

Would you like:
- Help deploying this project to a free hosting service (Render/Railway)?
- One round of **mock interview Q&A (live script)** practice?

Let’s make sure you’re 100% confident before facing recruiters!

Test APIs using Postman
