# 🛒 POS Backend System

A robust Point of Sale (POS) backend system built with **Spring Boot**, featuring JWT authentication, multi-store support, inventory management, and comprehensive APIs for retail operations.

---

## ✨ Features

- **🔐 JWT Authentication** – Secure user signup/login with Spring Security
- **👤 User Management** – User profiles, role-based access control
- **🏪 Store Management** – Multi-store support with store contacts
- **📦 Product & Category Management** – Full CRUD for products and categories
- **🏢 Branch Management** – Manage multiple branches per store
- **📊 Inventory Management** – Track stock across branches
- **👨‍💼 Employee Management** – Employee records and role assignment
- **🧾 Customer Management** – Customer profiles and data *(In Progress)*
- **📋 Order Management** – Order processing and tracking *(In Progress)*
- **💰 Refund Management** – Handle returns and refunds *(Coming Soon)*
- **📈 Shift Reports** – Daily shift reporting *(Coming Soon)*

---

## 🛠️ Tech Stack

| Technology | Purpose |
| --- | --- |
| **Java** | Core language |
| **Spring Boot** | Backend framework |
| **Spring Security** | Authentication & Authorization |
| **JWT** | Token-based authentication |
| **MySQL** | Database |
| **Maven** | Dependency management |
| **Postman** | API testing |

---

## 📁 Project Structure

```
src/main/java/
├── config/
│   ├── [SecurityConfig.java](http://SecurityConfig.java)
│   ├── [JWTValidator.java](http://JWTValidator.java)
│   ├── [JWTConstant.java](http://JWTConstant.java)
│   └── [JWTProvider.java](http://JWTProvider.java)
├── controller/
│   ├── [AuthController.java](http://AuthController.java)
│   ├── [UserController.java](http://UserController.java)
│   ├── [StoreController.java](http://StoreController.java)
│   ├── [ProductController.java](http://ProductController.java)
│   ├── [CategoryController.java](http://CategoryController.java)
│   ├── [BranchController.java](http://BranchController.java)
│   ├── [InventoryController.java](http://InventoryController.java)
│   └── [EmployeeController.java](http://EmployeeController.java)
├── service/
│   ├── [AuthService.java](http://AuthService.java)
│   ├── [UserService.java](http://UserService.java)
│   ├── [StoreService.java](http://StoreService.java)
│   ├── [ProductService.java](http://ProductService.java)
│   ├── [CategoryService.java](http://CategoryService.java)
│   ├── [BranchService.java](http://BranchService.java)
│   ├── [InventoryService.java](http://InventoryService.java)
│   └── [EmployeeService.java](http://EmployeeService.java)
├── service.impl/
│   └── [Service Implementations]
├── repository/
│   └── [JPA Repositories]
├── modal/
│   ├── [User.java](http://User.java)
│   ├── [Store.java](http://Store.java)
│   ├── [StoreContact.java](http://StoreContact.java)
│   ├── [Product.java](http://Product.java)
│   ├── [Category.java](http://Category.java)
│   ├── [Branch.java](http://Branch.java)
│   └── [Inventory.java](http://Inventory.java)
├── domain/
│   ├── [UserRole.java](http://UserRole.java)
│   └── [StoreStatus.java](http://StoreStatus.java)
├── dto/
│   └── [Data Transfer Objects]
├── mapper/
│   └── [Entity Mappers]
├── payload/
│   ├── request/
│   └── response/
│       ├── [AuthResponse.java](http://AuthResponse.java)
│       └── [ApiResponse.java](http://ApiResponse.java)
└── exceptions/
    └── [UserException.java](http://UserException.java)
```

---

## 🚀 Getting Started

### Prerequisites

- Java 17+
- Maven 3.6+
- MySQL 8.0+

### Installation

1. **Clone the repository**
    
    ```bash
    git clone [https://github.com/Ankur071/POS-Application.git](https://github.com/Ankur071/POS-Application.git)
    cd POS-Application
    ```
    
2. **Configure the database**
    
    Update [`application.properties`](http://application.properties) with your MySQL credentials:
    
    ```
    spring.datasource.url=jdbc:mysql://[localhost:3306/pos_db](http://localhost:3306/pos_db)
    spring.datasource.username=your_username
    spring.datasource.password=your_password
    ```
    
3. **Build and run**
    
    ```bash
    mvn clean install
    mvn spring-boot:run
    ```
    
4. **Access the API**
    
    ```
    [http://localhost:8080](http://localhost:8080)
    ```
    

---

## 📡 API Endpoints

### Authentication

| Method | Endpoint | Description |
| --- | --- | --- |
| POST | `/api/auth/signup` | Register a new user |
| POST | `/api/auth/login` | Login and get JWT token |

### Users

| Method | Endpoint | Description |
| --- | --- | --- |
| GET | `/api/users/profile` | Get current user profile |
| GET | `/api/users/{id}` | Get user by ID |

### Stores

| Method | Endpoint | Description |
| --- | --- | --- |
| POST | `/api/stores` | Create a new store |
| GET | `/api/stores` | Get all stores |
| GET | `/api/stores/{id}` | Get store by ID |

### Products & Categories

| Method | Endpoint | Description |
| --- | --- | --- |
| POST | `/api/products` | Create a product |
| GET | `/api/products` | Get all products |
| POST | `/api/categories` | Create a category |
| GET | `/api/categories` | Get all categories |

### Branches & Inventory

| Method | Endpoint | Description |
| --- | --- | --- |
| POST | `/api/branches` | Create a branch |
| GET | `/api/branches` | Get all branches |
| POST | `/api/inventory` | Add inventory item |
| GET | `/api/inventory` | Get inventory |

### Employees

| Method | Endpoint | Description |
| --- | --- | --- |
| POST | `/api/employees` | Add an employee |
| GET | `/api/employees` | Get all employees |

---

## 🔒 Authentication

This API uses **JWT (JSON Web Tokens)** for authentication.

1. Register or login to get a token
2. Include the token in the Authorization header:
    
    ```
    Authorization: Bearer <your_jwt_token>
    ```
    

---

## 📝 Development Progress

- [x]  Initial Spring Boot setup with JWT authentication
- [x]  User signup and login API
- [x]  User profile API
- [x]  Store APIs
- [x]  Product and Category APIs
- [x]  Branch APIs
- [x]  Inventory APIs
- [x]  Employee APIs
- [ ]  Customer APIs *(In Progress)*
- [ ]  Order APIs *(In Progress)*
- [ ]  Refund APIs
- [ ]  Shift Reports APIs

---

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

---

## 📄 License

This project is licensed under the MIT License.

---

## 👨‍💻 Author

**Ankur Yadav**

- GitHub: [@Ankur071](https://github.com/Ankur071)

---

⭐ If you find this project useful, please consider giving it a star!
