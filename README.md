# ✨ Task Manager Pro

A mini task management web application built with **Spring Boot** and **Thymeleaf**. Organize your life, one task at a time with this elegant and responsive task manager.

![Task Manager Pro](https://img.shields.io/badge/Spring%20Boot-2.7.18-green)
![Java](https://img.shields.io/badge/Java-8-blue)
![Maven](https://img.shields.io/badge/Maven-3.9+-orange)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-3.1+-purple)

## 🚀 Features

- **✨Modern UI** - Gradient backgrounds, smooth animations, and professional design
- **📱 Fully Responsive** - Works perfectly on desktop, tablet, and mobile devices
- **✅ Task Management** - Add, delete, and mark tasks as complete
- **📊 Real-time Statistics** - View total, completed, and pending tasks
- **🎨 Interactive Elements** - Hover effects, smooth transitions, and visual feedback
- **🔄 In-Memory Storage** - Fast performance with automatic data persistence during session

## 🏗️ Architecture Overview

```
┌─────────────────┐    HTTP Requests    ┌──────────────────┐    Data Binding    ┌─────────────────┐
│   Frontend      │ ◄─────────────────► │   Backend        │ ◄─────────────────► │   Data Layer    │
│   (Browser)     │                     │   (Spring Boot)  │                     │   (In-Memory)   │
│                 │                     │                  │                     │                 │
│ • HTML5         │                     │ • Controller     │                     │ • ArrayList     │
│ • CSS3          │                     │ • Model          │                     │ • Task Objects  │
│ • Thymeleaf     │                     │ • Service Layer  │                     │ • Session Data  │
│ • Responsive    │                     │ • REST Endpoints │                     │                 │
└─────────────────┘                     └──────────────────┘                     └─────────────────┘
```

## 🔄 Data Flow

```
1. User Input → 2. HTTP Request → 3. Controller → 4. Model Update → 5. View Render → 6. Browser Display
   ↓              ↓                ↓           ↓           ↓           ↓
   Type task     POST /add        Process     Update      Thymeleaf   Show updated
   & submit      Form data        request     task list   template    task list
```

## 🛠️ Technology Stack

### **Backend**
- **Java 8** - Modern Java with enhanced features
- **Spring Boot 2.7.18** - Rapid application development framework
- **Spring MVC** - Web framework for building web applications
- **Maven** - Dependency management and build tool

### **Frontend**
- **Thymeleaf 3.1+** - Server-side HTML template engine
- **HTML5** - Semantic markup
- **CSS3** - Modern styling with gradients, animations, and responsive design
- **JavaScript** - Minimal client-side interactions

### **Data Storage**
- **In-Memory Storage** - Fast ArrayList-based storage (data persists during session)
- **H2 Database** - Embedded database (configured but not currently used)

## 📁 Project Structure

```
demo/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/demo/
│   │   │       ├── DemoApplication.java      # Main Spring Boot application
│   │   │       ├── controller/
│   │   │       │   └── TaskController.java   # HTTP request handler
│   │   │       └── model/
│   │   │           └── Task.java             # Task entity class
│   │   └── resources/
│   │       ├── templates/
│   │       │   └── index.html               # Main HTML template
│   │       ├── static/                      # Static assets (CSS, JS, images)
│   │       └── application.properties       # Application configuration
│   └── test/
│       └── java/
│           └── com/example/demo/
│               └── DemoApplicationTests.java # Unit tests
├── pom.xml                                  # Maven dependencies
├── mvnw                                     # Maven wrapper (Unix)
├── mvnw.cmd                                # Maven wrapper (Windows)
└── README.md                               # This file
```

## 🚀 Getting Started

### **Prerequisites**
- **Java 8** 
- **Maven 3.9+** (or use the included Maven wrapper)

### **Installation & Running**

1. **Clone the repository**
   ```bash
   git clone https://github.com/SaiSiriChandana/spring-boot-todo-app.git
   cd spring-boot-todo-app
   ```

2. **Run the application**
   ```bash
   # Using Maven wrapper (recommended)
   ./mvnw spring-boot:run          # On Unix/Mac
   mvnw.cmd spring-boot:run        # On Windows
   
   # Or using Maven directly
   mvn spring-boot:run
   ```

3. **Open your browser**
   Navigate to `http://localhost:8080`

4. **Start managing tasks!**
   - Type a task in the input field
   - Click "Add Task" to add it
   - Check the checkbox to mark as complete
   - Click "Delete" to remove tasks

## 🔧 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| `GET`  | `/`      | Display main page with all tasks |
| `POST` | `/add`   | Add a new task |
| `GET`  | `/delete/{id}` | Delete a task by ID |
| `GET`  | `/toggle/{id}` | Toggle task completion status |


*Happy task managing! ✨*
