# 🛒 Enterprise POS System – Spring Boot Backend

[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![Java](https://img.shields.io/badge/Java-17+-orange.svg)](https://www.oracle.com/java/)
[![MySQL](https://img.shields.io/badge/MySQL-8.0+-blue.svg)](https://www.mysql.com/)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

A robust, enterprise-grade **Point of Sale (POS)** backend system built with **Spring Boot**, featuring JWT authentication, multi-store/multi-branch support, inventory management, and comprehensive RESTful APIs for retail operations.

---

## 📋 Table of Contents

- [Features](#-features)
- [Tech Stack](#️-tech-stack)
- [Project Structure](#-project-structure)
- [Getting Started](#-getting-started)
- [API Documentation](#-api-documentation)
- [Authentication](#-authentication)
- [Development Progress](#-development-progress)
- [Contributing](#-contributing)
- [Author](#-author)

---

## ✨ Features

| Module | Description |
|--------|-------------|
| 🔐 **JWT Authentication** | Secure signup/login with Spring Security & JWT tokens |
| 👤 **User Management** | User profiles, role-based access control (ADMIN, STORE_ADMIN, MANAGER, CASHIER) |
| 🏪 **Store Management** | Multi-store support with store contacts & moderation |
| 🏢 **Branch Management** | Manage multiple branches per store with working hours |
| 📦 **Product & Category** | Full CRUD for products and categories per store |
| 📊 **Inventory Management** | Track stock levels across branches |
| 👨‍💼 **Employee Management** | Employee records and role assignment per store/branch |
| 👥 **Customer Management** | Customer profiles with search functionality |
| 🛒 **Order Management** | Order processing with items, payments, and tracking |
| 💰 **Refund Management** | Handle returns and process refunds |
| 📈 **Analytics Dashboard** | Admin, Store & Branch analytics with sales insights |

---

## 🛠️ Tech Stack

### Core Technologies

| Technology | Description |
|------------|-------------|
| **Java 17** | Core programming language |
| **Spring Boot 3.x** | Backend framework |
| **Spring Security** | Authentication & Authorization |
| **Spring Data JPA** | Database ORM with Hibernate |
| **MySQL 8.0** | Relational database |
| **Maven** | Build & dependency management |

### Security & Authentication

| Technology | Description |
|------------|-------------|
| **JWT (jjwt)** | Token-based stateless authentication |
| **BCrypt** | Password hashing |
| **CORS** | Cross-origin resource sharing |

### Development Tools

| Tool | Description |
|------|-------------|
| **Lombok** | Reduces boilerplate code |
| **Spring DevTools** | Hot reload during development |
| **Postman** | API testing & documentation |

---

## 📁 Project Structure

```
pos-backend/
├── src/main/java/com/zosh/
│   ├── configuration/        # Security config, JWT filters
│   │   ├── SecurityConfig.java
│   │   ├── JWTValidator.java
│   │   ├── JWTConstant.java
│   │   └── JWTProvider.java
│   │
│   ├── controller/           # REST API endpoints
│   │   ├── AuthController.java
│   │   ├── UserController.java
│   │   ├── StoreController.java
│   │   ├── BranchController.java
│   │   ├── ProductController.java
│   │   ├── CategoryController.java
│   │   ├── InventoryController.java
│   │   ├── EmployeeController.java
│   │   ├── CustomerController.java
│   │   ├── OrderController.java
│   │   ├── RefundController.java
│   │   └── ...AnalyticsControllers
│   │
│   ├── service/              # Business logic interfaces
│   ├── service/impl/         # Service implementations
│   ├── repository/           # JPA repositories
│   │
│   ├── modal/                # Entity classes
│   │   ├── User.java
│   │   ├── Store.java
│   │   ├── Branch.java
│   │   ├── Product.java
│   │   ├── Category.java
│   │   ├── Inventory.java
│   │   ├── Customer.java
│   │   ├── Order.java
│   │   ├── OrderItem.java
│   │   └── Refund.java
│   │
│   ├── domain/               # Enums (UserRole, StoreStatus, etc.)
│   ├── payload/dto/          # Data Transfer Objects
│   ├── mapper/               # Entity ↔ DTO mappers
│   ├── exceptions/           # Custom exception classes
│   └── ZoshPosSystemApplication.java
│
└── src/main/resources/
    └── application.properties
```

---

## 🚀 Getting Started

### Prerequisites

- **Java 17** or higher
- **Maven 3.6+**
- **MySQL 8.0+**
- **Git**

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/Ankur071/POS-Application.git
   cd POS-Application/pos-backend
   ```

2. **Create MySQL database**
   ```sql
   CREATE DATABASE pos_db;
   ```

3. **Configure application properties**
   
   Create `src/main/resources/application.properties`:
   ```properties
   # Server
   server.port=5000

   # Database
   spring.datasource.url=jdbc:mysql://localhost:3306/pos_db
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update

   # JWT
   jwt.secret=your_jwt_secret_key
   ```

4. **Build and run**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

5. **Access the API**
   ```
   http://localhost:5000
   ```

---

## 📡 API Documentation

### 🔐 Authentication

| Method | Endpoint | Description |
|--------|----------|-------------|
| `POST` | `/api/auth/signup` | Register a new user |
| `POST` | `/api/auth/login` | Login and receive JWT token |

### 👤 Users

| Method | Endpoint | Description |
|--------|----------|-------------|
| `GET` | `/api/users/profile` | Get current user profile |
| `GET` | `/api/users/{id}` | Get user by ID |

### 🏪 Stores

| Method | Endpoint | Description |
|--------|----------|-------------|
| `POST` | `/api/stores` | Create a new store |
| `GET` | `/api/stores` | Get all stores |
| `GET` | `/api/stores/{id}` | Get store by ID |
| `PUT` | `/api/stores/{id}` | Update store |
| `DELETE` | `/api/stores/{id}` | Delete store |

### 🏢 Branches

| Method | Endpoint | Description |
|--------|----------|-------------|
| `POST` | `/api/branches` | Create a branch |
| `GET` | `/api/branches` | Get all branches |
| `GET` | `/api/branches/{id}` | Get branch by ID |
| `GET` | `/api/branches/store/{storeId}` | Get branches by store |

### 📦 Products & Categories

| Method | Endpoint | Description |
|--------|----------|-------------|
| `POST` | `/api/products` | Create a product |
| `GET` | `/api/products` | Get all products |
| `GET` | `/api/products/store/{storeId}` | Get products by store |
| `POST` | `/api/categories` | Create a category |
| `GET` | `/api/categories/store/{storeId}` | Get categories by store |

### 📊 Inventory

| Method | Endpoint | Description |
|--------|----------|-------------|
| `POST` | `/api/inventories` | Add inventory |
| `GET` | `/api/inventories/branch/{branchId}` | Get inventory by branch |
| `PUT` | `/api/inventories/{id}` | Update inventory |

### 👨‍💼 Employees

| Method | Endpoint | Description |
|--------|----------|-------------|
| `POST` | `/api/employees/store/{storeId}` | Create store employee |
| `POST` | `/api/employees/branch/{branchId}` | Create branch employee |
| `GET` | `/api/employees/store/{storeId}` | Get store employees |
| `GET` | `/api/employees/branch/{branchId}` | Get branch employees |

### 🛒 Orders

| Method | Endpoint | Description |
|--------|----------|-------------|
| `POST` | `/api/orders` | Create new order |
| `GET` | `/api/orders/{id}` | Get order by ID |
| `GET` | `/api/orders/branch/{branchId}` | Get orders by branch |
| `GET` | `/api/orders/today/branch/{id}` | Get today's orders |
| `GET` | `/api/orders/recent/{branchId}` | Get recent 5 orders |

### 💰 Refunds

| Method | Endpoint | Description |
|--------|----------|-------------|
| `POST` | `/api/refunds` | Create refund |
| `GET` | `/api/refunds` | Get all refunds |
| `GET` | `/api/refunds/branch/{branchId}` | Get refunds by branch |
| `GET` | `/api/refunds/cashier/{id}` | Get refunds by cashier |

---

## 🔒 Authentication

This API uses **JWT (JSON Web Tokens)** for stateless authentication.

### Flow:
1. **Register** or **Login** to receive a JWT token
2. Include the token in all subsequent requests:
   ```http
   Authorization: Bearer <your_jwt_token>
   ```

### User Roles:
| Role | Access Level |
|------|--------------|
| `ROLE_ADMIN` | System administrator |
| `ROLE_STORE_ADMIN` | Store owner/admin |
| `ROLE_STORE_MANAGER` | Store-level manager |
| `ROLE_BRANCH_MANAGER` | Branch-level manager |
| `ROLE_BRANCH_CASHIER` | POS terminal cashier |

---

## 📝 Development Progress

### ✅ Completed Modules

- [x] JWT Authentication (Signup/Login)
- [x] User Profile API
- [x] Store Management APIs
- [x] Product & Category APIs
- [x] Branch Management APIs
- [x] Inventory Management APIs
- [x] Employee Management APIs
- [x] Customer Management APIs
- [x] Order Management APIs
- [x] Refund Management APIs

### 🚧 In Progress

- [ ] Admin Dashboard APIs
- [ ] Branch Analytics APIs
- [ ] Store Analytics APIs
- [ ] Payment Gateway Integration (Razorpay/Stripe)
- [ ] Email Notifications
- [ ] PDF Bill Generation
- [ ] Subscription Management

---

## 🤝 Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

---

## 📄 License

This project is licensed under the **MIT License** - see the [LICENSE](LICENSE) file for details.

---

## 👨‍💻 Author

**Ankur Yadav**

[![GitHub](https://img.shields.io/badge/GitHub-@Ankur071-181717?style=flat&logo=github)](https://github.com/Ankur071)

---

<p align="center">
  ⭐ If you find this project useful, please consider giving it a star!
</p>
