# ItemHub API

ItemHub API is a simple Java Spring Boot RESTful application for managing items using an **in-memory data store (ArrayList)**.  
This project demonstrates basic REST API design, input validation, and clean layered architecture.

---

## 🚀 Features

- Add a new item
- Get an item by ID
- Input validation using Bean Validation
- In-memory storage (no database)
- RESTful API design

---

## 🛠️ Tech Stack

- Java 17
- Spring Boot
- Spring Web
- Spring Validation
- Maven

---

## 📂 Project Structure

org.itemhub.api
├── controller
│ └── ItemController.java
├── entity
│ └── Item.java
├── service
│ └── ItemService.java
├── dto
│ └── ResponseStructure.java
└── ItemHubApiApplication.java

---

## 🌐 Live Demo

Base URL:
https://itemhub-api-production.up.railway.app

Add Item:
POST /api/items

Get Item by ID:
GET /api/items/{id}

---

## ▶️ How to Run the Application

### Prerequisites
- Java 17 installed
- Maven installed
- IDE (Eclipse / IntelliJ) or terminal

### Run using IDE
1. Open the project in your IDE
2. Locate the main class:
3. Right-click → **Run as Java Application**

### Run using Maven
```bash
mvn spring-boot:run
