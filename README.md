# Student Service API Documentation

## Overview
The Student Service API manages student data within system. It allows for the creation, retrieval, updating, and deletion of student records.

## Architecture
The API is developed using the Spring Boot framework, leveraging Spring Data JPA for database interaction. PostgreSQL is used as the underlying database. The API follows RESTful principles for its endpoints.

## Endpoints and Routes
The following endpoints are available in the Student Service API:

#### Student Routes
- `GET /api/v1/student` - Retrieve all students.
- `GET /api/v1/student/{studentId}` - Retrieve a student by ID.
- `POST /api/v1/student` - Create a new student.
- `PUT /api/v1/student/{studentId}` - Update a student by ID.
- `DELETE /api/v1/student/{studentId}` - Delete a student by ID.

## Data Models
- **Student:** Represents a student with fields for name, email, date of birth (DOB), and age.

## How to Use
To utilize the Student Service API, follow these steps:

1. Clone the project repository.
2. Ensure that PostgreSQL is installed and running.
3. Update the database configuration in `application.properties` file if necessary.
4. Build the project using Maven: `mvn clean install`.
5. Run the Spring Boot application: `mvn spring-boot:run`.


## Conclusion
The Student Service API provides a straightforward interface for managing student data within an educational context. It offers CRUD operations for student records and can be easily integrated into existing systems.
