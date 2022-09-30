# CRUD API SpringBoot
This project is developed in java 8  
__Have this packages:__
* Mysql Driver
* Spring Web
* Spring Data JPA
* Spring Boot DevTools
* Lombok        
------------------------------------------------------------  
## Database Configuration
__application.properties__
```
spring.datasource.url = jdbc:mysql://localhost:3306/crudapi
spring.datasource.username = username
spring.datasource.password = password
spring.jpa.hibernate.ddl-auto = none
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```
__Database__
```
CREATE DATABASE crudapi;
```
__Tables__
```
CREATE TABLE category (
	id_category INTEGER auto_increment NOT NULL,
	category_name varchar(100) NULL,
	PRIMARY KEY(id_category)
);
CREATE TABLE product(
	id_product INTEGER AUTO_INCREMENT NOT NULL,
	id_category INTEGER NOT NULL,
	product_name VARCHAR(100) NOT NULL,
	brand VARCHAR(100) NOT NULL,
	unit_price DECIMAL(15,2) NOT NULL,
	stock INTEGER NOT NULL,
	PRIMARY KEY(id_product),
	FOREIGN KEY(id_category) REFERENCES category(id_category)
); 
```
------------------------------------------------------------  
__List of endpoints__
```
GET    /products/
GET    /products/{product}
POST   /products/add
PUT    /products/edit/{product}
DELETE /products/delete/{product}
```
