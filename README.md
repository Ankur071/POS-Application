# 🛒 POS Application

A full-stack **Point of Sale (POS) System** for retail management with multi-store support, inventory tracking, sales processing, and real-time analytics.

---

## 🚀 Tech Stack

| Layer | Technology |
|-------|------------|
| **Frontend** | React 19, Vite 7, Redux Toolkit, Tailwind CSS, Radix UI |
| **Backend** | Spring Boot, Spring Security, JWT, MySQL |
| **Payments** | Razorpay Integration |

---

## 📁 Project Structure

```
POS-Application/
├── pos-backend/          # Spring Boot REST API
│   ├── src/main/java/
│   │   ├── config/       # Security & JWT configuration
│   │   ├── controller/   # REST controllers
│   │   ├── service/      # Business logic
│   │   ├── repository/   # JPA repositories
│   │   └── modal/        # Entity models
│   └── pom.xml
│
├── pos-frontend/         # React SPA
│   ├── src/
│   │   ├── components/   # Reusable UI components
│   │   ├── pages/        # Role-based page modules
│   │   ├── Redux Toolkit/ # State management (22 slices)
│   │   ├── routes/       # Role-based routing
│   │   └── utils/        # Helper functions
│   └── package.json
│
└── README.md
```

---

## ✨ Features

| Module | Description |
|--------|-------------|
| 🔐 **Authentication** | JWT-based login with role-based access |
| 🏪 **Store Management** | Multi-store support with branch hierarchy |
| 📦 **Inventory** | Real-time stock tracking across branches |
| 🛒 **POS Operations** | Cart, checkout, payment processing |
| 💳 **Payments** | Razorpay integration for transactions |
| 📊 **Analytics** | Store & branch-level reports with charts |
| 👥 **User Roles** | Super Admin, Store Admin, Branch Manager, Cashier |

---

## 🏃 Quick Start

### Backend
```bash
cd pos-backend
mvn spring-boot:run
# API: http://localhost:8080
```

### Frontend
```bash
cd pos-frontend
pnpm install
pnpm run dev
# App: http://localhost:5173
```

---

## 👥 Team

| Contributor | Role |
|-------------|------|
| [@Ankur071](https://github.com/Ankur071) | Full-Stack Developer |
| [@RishabhK488](https://github.com/RishabhK488) | Frontend Developer |

---

## 📄 License

MIT License

---

⭐ **Star this repo if you find it useful!**
