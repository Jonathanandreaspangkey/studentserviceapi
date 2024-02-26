# Student Service API Documentation

## Overview
This is Spring boot Student Service API that manages student data within system. It allows for the creation, retrieval, updating, and deletion of student records.

## Architecture
<img width="638" alt="Screenshot 2024-02-22 at 15 45 06" src="https://github.com/Jonathanpangkey/StudentServiceAPI/assets/102292312/a3a26e47-86e3-4d5c-8b15-d0f7001fe143"> <br/>
The API is developed using the Spring Boot framework, leveraging Spring Data JPA for database interaction. PostgreSQL is used as the underlying database. The API follows RESTful principles for its endpoints. <br/>
This app is structured into three layers : The API layer handles requests and responses, the service layer manages application logic, and the data access layer deals with database operations.
## Endpoints and Routes
The following endpoints are available in the Student Service API:

#### Student Routes
- `GET /api/v1/student` - Retrieve all students.
- `GET /api/v1/student/{studentId}` - Retrieve a student by ID.
- `POST /api/v1/student` - Create a new student.
- `PUT /api/v1/student/{studentId}` - Update a student by ID.
- `DELETE /api/v1/student/{studentId}` - Delete a student by ID.

## Data Models
- **Student:** Represents a student with fields for name, email, date of birth (DOB), and age. The 'age' field is marked as transient and is calculated based on the 'dob' field.

## How to Use
To utilize the Student Service API, follow these steps:

1. Clone the project repository.
2. Ensure that PostgreSQL is installed and running.
3. Update the database configuration in `application.properties` file if necessary.
4. Run the application with your favorite IDE (preferred IntelliJ IDEA)
5. Test the application with testing tools like postman or by sending HTTP requests directly from your client application.
