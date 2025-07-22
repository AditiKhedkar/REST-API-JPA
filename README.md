A simple RESTful web service built using Spring Boot, Spring Data JPA, and H2 in-memory database. This API allows you to perform CRUD operations on Product entities.

🚀 Features
Full CRUD API for Product

JPA Repository for data access

Service layer abstraction

H2 Database for easy in-memory testing

Uses Lombok to reduce boilerplate code

RESTful endpoints following best practices

📁 Project Structure
graphql
Copy
Edit
src/main/java/com/example/demo
├── controller       # REST endpoints
├── entity           # JPA entity class (Product)
├── repository       # Spring Data JPA repository
├── service          # Business logic
└── DemoApplication  # Main entry point
🧪 API Endpoints
Method	Endpoint	Description
GET	/api/products	Get all products
GET	/api/products/{id}	Get product by ID
POST	/api/products	Create new product
PUT	/api/products/{id}	Update full product
PATCH	/api/products/{id}	Update partial fields
DELETE	/api/products/{id}	Delete product

🛠️ Technologies Used
Java 17+

Spring Boot 3.x

Spring Data JPA

H2 Database

Lombok

Maven

⚙️ Getting Started
1. Clone the repo
bash
Copy
Edit
git clone https://github.com/your-username/demo-rest-api.git
cd demo-rest-api
2. Run the application
bash
Copy
Edit
mvn spring-boot:run
3. Access H2 Console (Optional)
URL: http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:testdb

📬 Sample Product JSON
json
Copy
Edit
{
  "name": "Laptop",
  "price": 45000.0,
  "category": "Electronics"
}
