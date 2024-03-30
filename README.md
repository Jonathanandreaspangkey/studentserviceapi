# Student Service API Documentation

## Overview
This is Spring boot Student Service API that manages student data within system. It allows for the creation, retrieval, updating, and deletion of student records.

## Architecture
<img width="638" alt="Screenshot 2024-02-22 at 15 45 06" src="https://github.com/Jonathanpangkey/StudentServiceAPI/assets/102292312/a3a26e47-86e3-4d5c-8b15-d0f7001fe143"> <br/>
The API is developed using the Spring Boot framework, leveraging Spring Data JPA for database interaction and PostgreSQL is used as the underlying database, the API also follows RESTful principles for its endpoints. <br/>
This app is structured into three layers : The API layer handles requests and responses, the service layer manages application logic, and the data access layer deals with database operations.
## Endpoints and Routes
The following endpoints are available in the Student Service API:

## Student Endpoints

1. **Retrieve All Students**
   - URL: `/api/v1/student`
   - Method: `GET`
   - Description: Retrieves all students.
2. **Retrieve a Student by ID**
   - URL: `/api/v1/student/{studentId}`
   - Method: `GET`
   - Description: Retrieves a student by ID.
   - Path Parameters:
     - `studentId`: ID of the student to retrieve.
3. **Create a New Student**
   - URL: `/api/v1/student`
   - Method: `POST`
   - Description: Creates a new student.
   - Request Body:
     ```json
     {
       "name": "string",
       "email": "string",
       "dateOfBirth": "string"
     }
     ```
4. **Update a Student by ID**
   - URL: `/api/v1/student/{studentId}`
   - Method: `PUT`
   - Description: Updates a student by ID.
   - Path Parameters:
     - `studentId`: ID of the student to update.
   - Request Body (optional fields):
     ```json
     {
       "name": "string",
       "email": "string",
       "dateOfBirth": "string"
     }
     ```
5. **Delete a Student by ID**
   - URL: `/api/v1/student/{studentId}`
   - Method: `DELETE`
   - Description: Deletes a student by ID.
   - Path Parameters:
     - `studentId`: ID of the student to delete.

## Data Models
- **Student:**
  - Fields:
    - Name: String
    - Email: String
    - Date of Birth (DOB): LocalDate
    - Age (Transient, calculated based on DOB): Integer


## Clone
If you want to use or modify this app:

1. Clone the project repository.
2. Ensure that PostgreSQL is installed and running.
3. Update the database configuration in `application.properties` file if necessary.
4. Run the application with your favorite IDE (preferred IntelliJ IDEA)
5. Test the application with testing tools like postman or by sending HTTP requests directly from your client application.
