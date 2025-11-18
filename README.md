# 🛍️ Ecommerce StoreFront

A full-stack ecommerce store using Spring Boot + React + Bootstrap CSS

# 🧰 Tech Stack
Frontend
* React
* Vite
* JavaScript (ES6)
* Bootstrap
* Fetch API

Backend

* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL

Additional

* CORS configuration
* CommandLineRunner for database seeding

# 🏷️ Key Features

* Browse categories and products.
* Filter products by category.
* Sort & search functionality on frontend.
* Clean UI powered by Bootstrap.
* REST APIs for data retrieval.

# 📡 Endpoints
![image alt](https://github.com/patelaviral/Ecommerce_StoreFront/blob/921fd4024fb1b37d5f1524ac07521d86db0f0e87/endPoint.png)

# 📁 Project Structure (suggested)
```
/backend
  ├─ src/main/java/com/example/
      ├─ controller/
      ├─ service/
      ├─ repository/
      ├─ model/
  ├─ resources/
      ├─ application.properties
      ├─ data-seed-runner.java  (CommandLineRunner)

/frontend
  ├─ src/
      ├─ components/
      ├─ pages/
      ├─ api/
      ├─ App.jsx
      ├─ index.jsx
  ├─ public/
      ├─ index.html
```

# 🚀 Setup & Run
Backend
1. Configure MySQL database and update application.properties.
2. Run the Spring Boot application:
```
mvn clean install
mvn spring-boot:run
```
3. On startup the database will be seeded via CommandLineRunner.

Frontend

1. Navigate to frontend directory:
```
cd frontend
```
2. Install dependencies:
```
npm install
```
3. Start development server:
```
npm run dev
```
4. Open http://localhost:5173
 in your browser.

# 🖥️ Screenshots

Example UI – Product Catalog view
![image alt](https://github.com/patelaviral/Ecommerce_StoreFront/blob/921fd4024fb1b37d5f1524ac07521d86db0f0e87/UI_ecomm.png)

# 🚧 Future Enhancements

* Add user authentication (login/register)
* Add shopping cart and checkout workflow
* Integrate payment gateway
* Implement admin dashboard for product/category management
* Improve UI/UX (filters, pagination, image slider)
Implement admin dashboard for product/category management

Improve UI/UX (filters, pagination, image slider)
