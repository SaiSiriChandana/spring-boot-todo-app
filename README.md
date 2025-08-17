# ✨ Task Manager Pro

A beautiful, modern task management web application built with **Spring Boot** and **Thymeleaf**. Organize your life, one task at a time with this elegant and responsive task manager.

![Task Manager Pro](https://img.shields.io/badge/Spring%20Boot-3.5.4-green)
![Java](https://img.shields.io/badge/Java-17-blue)
![Maven](https://img.shields.io/badge/Maven-3.9+-orange)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-3.1+-purple)

## 🚀 Features

- **✨ Beautiful Modern UI** - Gradient backgrounds, smooth animations, and professional design
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
- **Java 17** - Modern Java with enhanced features
- **Spring Boot 3.5.4** - Rapid application development framework
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
- **Java 17** or higher
- **Maven 3.9+** (or use the included Maven wrapper)

### **Installation & Running**

1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/task-manager-pro.git
   cd task-manager-pro
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

## 🎨 UI Features

### **Design Elements**
- **Gradient Backgrounds** - Beautiful purple-to-blue gradients
- **Card-based Layout** - Modern card design with shadows
- **Responsive Grid** - Adapts to different screen sizes
- **Smooth Animations** - Hover effects and transitions

### **Interactive Components**
- **Task Input Form** - Clean, focused input with validation
- **Task Cards** - Individual cards for each task
- **Checkboxes** - Click to toggle completion status
- **Delete Buttons** - Red delete buttons with hover effects
- **Statistics Panel** - Real-time task count display

## 📱 Responsive Design

The application is fully responsive and works on:
- **Desktop** - Full-featured layout with side-by-side elements
- **Tablet** - Optimized spacing and touch-friendly buttons
- **Mobile** - Stacked layout with full-width elements

## 🧪 Testing

Run the test suite:
```bash
./mvnw test
```

## 🚀 Deployment

### **Local Development**
```bash
mvn spring-boot:run
```

### **Production Build**
```bash
mvn clean package
java -jar target/demo-0.0.1-SNAPSHOT.jar
```

### **Docker (Optional)**
```dockerfile
FROM openjdk:17-jdk-slim
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
```

## 🔮 Future Enhancements

- [ ] **Database Integration** - Persistent storage with H2/MySQL
- [ ] **User Authentication** - Login and user management
- [ ] **Task Categories** - Organize tasks by project/priority
- [ ] **Due Dates** - Set deadlines and reminders
- [ ] **Search & Filter** - Find tasks quickly
- [ ] **Dark Mode** - Toggle between light and dark themes
- [ ] **Task Sharing** - Collaborate with team members
- [ ] **API Documentation** - Swagger/OpenAPI integration

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🙏 Acknowledgments

- **Spring Boot Team** - For the amazing framework
- **Thymeleaf** - For the template engine
- **Maven** - For dependency management
- **OpenJDK** - For Java runtime

## 📞 Support

If you have any questions or need help:
- Create an issue on GitHub
- Check the Spring Boot documentation
- Review the code comments

---

**Made with ❤️ using Spring Boot**

*Happy task managing! ✨*
