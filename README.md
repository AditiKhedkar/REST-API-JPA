# 🛒 Extended Product REST API

A Spring Boot application with extended e-commerce functionality.

## 🔧 Features

### 1. Product
Represents an item for sale. Fields: `id`, `name`, `price`, `category` (linked).

### 2. Category
Groups products under a common name. One category → many products.

### 3. Order
Represents a purchase made by a user. Fields: `id`, `orderDate`, list of items.

### 4. OrderItem
Links an `Order` to individual `Product`s with `quantity` and `unitPrice`.

### 5. DTOs (optional)
Used to expose safe, client-facing data formats (not added yet).

### 6. JPA Relationships
- One-to-Many: `Category` → `Product`
- One-to-Many: `Order` → `OrderItem`
- Many-to-One: `OrderItem` → `Product`

## 📁 Structure

- `entity/` – All JPA entities (tables)
- `repository/` – Spring Data interfaces for DB access
- `controller/` – REST APIs for external access
- `service/` – Business logic (optional for Order/Category)

## 🚀 How to Run

```bash
mvn spring-boot:run
```

Access H2 DB: `http://localhost:8080/h2-console`

---

Want to add User Authentication, Swagger Docs, or pagination next? Let me know!