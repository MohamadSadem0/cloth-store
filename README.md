# E-commerce Database Schema and ERD

## Overview

This database schema supports an e-commerce application with functionalities for user management, store management, order processing, product categorization, reviews, and wishlists. Additionally, it includes the management of address properties such as countries, states, zip codes, and streets.

## Tables

### User

- **Attributes**:
  - `userId`: Long (Primary Key)
  - `username`: String
  - `email`: String
  - `passwordHash`: String
  - `passwordSalt`: String
  - `role`: String (e.g., 'customer', 'store_owner', 'admin', 'employee')
  - `firstName`: String
  - `lastName`: String
  - `phoneNumber`: String
  - `shippingAddress`: Address (Foreign Key)
  - `createdAt`: Date
  - `updatedAt`: Date
  - `lastLogin`: Date

### Address

- **Attributes**:
  - `addressId`: Long (Primary Key)
  - `details`: String
  - `name`: String
  - `location`: String
  - `countryId`: Long (Foreign Key to Country)
  - `stateId`: Long (Foreign Key to State)
  - `zipCodeId`: Long (Foreign Key to ZipCode)
  - `streetId`: Long (Foreign Key to Street)

### Store

- **Attributes**:
  - `storeId`: Long (Primary Key)
  - `userId`: Long (Foreign Key to User)
  - `storeName`: String
  - `storeDescription`: String
  - `storeLogoUrl`: String
  - `storeUrl`: String
  - `storeAddress`: Address (Foreign Key)
  - `createdAt`: Date
  - `updatedAt`: Date
  - `isActive`: Boolean

### Branch

- **Attributes**:
  - `branchId`: Long (Primary Key)
  - `storeId`: Long (Foreign Key to Store)
  - `branchName`: String
  - `branchAddress`: Address (Foreign Key)
  - `createdAt`: Date
  - `updatedAt`: Date
  - `isActive`: Boolean

### Order

- **Attributes**:
  - `orderId`: Long (Primary Key)
  - `userId`: Long (Foreign Key to User)
  - `orderDate`: Date
  - `totalAmount`: BigDecimal
  - `status`: String (e.g., 'pending', 'completed', 'canceled', 'refunded')
  - `shippingAddress`: Address (Foreign Key)
  - `billingAddress`: Address (Foreign Key)
  - `paymentStatus`: String (e.g., 'pending', 'paid', 'failed')
  - `trackingNumber`: String
  - `employeeId`: Long (Foreign Key to Employee)
  - `createdAt`: Date
  - `updatedAt`: Date

### OrderItem

- **Attributes**:
  - `orderItemId`: Long (Primary Key)
  - `orderId`: Long (Foreign Key to Order)
  - `productId`: Long (Foreign Key to Product)
  - `quantity`: Integer
  - `priceAtPurchase`: BigDecimal
  - `createdAt`: Date

### Category

- **Attributes**:
  - `categoryId`: Long (Primary Key)
  - `categoryName`: String
  - `parentCategoryId`: Long (Foreign Key to Category)
  - `createdAt`: Date
  - `updatedAt`: Date

### Product

- **Attributes**:
  - `productId`: Long (Primary Key)
  - `storeId`: Long (Foreign Key to Store)
  - `productName`: String
  - `productDescription`: String
  - `price`: BigDecimal
  - `stockQuantity`: Integer
  - `imageUrl`: String
  - `size`: String
  - `color`: String
  - `categoryId`: Long (Foreign Key to Category)
  - `createdAt`: Date
  - `updatedAt`: Date
  - `isActive`: Boolean

### Review

- **Attributes**:
  - `reviewId`: Long (Primary Key)
  - `productId`: Long (Foreign Key to Product)
  - `userId`: Long (Foreign Key to User)
  - `rating`: Integer
  - `comment`: String
  - `createdAt`: Date

### Wishlist

- **Attributes**:
  - `wishlistId`: Long (Primary Key)
  - `userId`: Long (Foreign Key to User)
  - `createdAt`: Date

### WishlistItem

- **Attributes**:
  - `wishlistItemId`: Long (Primary Key)
  - `wishlistId`: Long (Foreign Key to Wishlist)
  - `productId`: Long (Foreign Key to Product)
  - `createdAt`: Date

### Employee

- **Attributes**:
  - `employeeId`: Long (Primary Key)
  - `branchId`: Long (Foreign Key to Branch)
  - `userId`: Long (Foreign Key to User)
  - `role`: String (e.g., 'manager', 'seller', 'cashier')
  - `createdAt`: Date
  - `updatedAt`: Date
  - `isActive`: Boolean

### Country

- **Attributes**:
  - `countryId`: Long (Primary Key)
  - `name`: String

### State

- **Attributes**:
  - `stateId`: Long (Primary Key)
  - `name`: String
  - `countryId`: Long (Foreign Key to Country)

### ZipCode

- **Attributes**:
  - `zipCodeId`: Long (Primary Key)
  - `code`: String
  - `stateId`: Long (Foreign Key to State)

### Street

- **Attributes**:
  - `streetId`: Long (Primary Key)
  - `name`: String
  - `zipCodeId`: Long (Foreign Key to ZipCode)

## ERD

![ERD](file:///mnt/data/erd.jpeg)

This ERD visually represents the relationships between the tables in the database schema. Each entity is connected to others through foreign key relationships, ensuring data integrity and supporting complex queries and operations required for the e-commerce application.

## API Endpoints

### Address Properties

- **Country**
  - `GET /api/countries`: Retrieve all countries.
  - `POST /api/countries`: Add a new country.
- **State**
  - `GET /api/states`: Retrieve all states.
  - `POST /api/states`: Add a new state.
- **ZipCode**
  - `GET /api/zipcodes`: Retrieve all zip codes.
  - `POST /api/zipcodes`: Add a new zip code.
- **Street**
  - `GET /api/streets`: Retrieve all streets.
  - `POST /api/streets`: Add a new street.

These endpoints provide the necessary functionality to manage address properties dynamically in the application.

## Conclusion

This database schema, combined with the ERD and API endpoints, supports comprehensive address management within an e-commerce platform. Users can select and add address properties dynamically, ensuring flexibility and ease of use. The schema also integrates seamlessly with other core functionalities of the platform, such as user management, store management, and order processing.
