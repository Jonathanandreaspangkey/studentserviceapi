package com.example.demo.Student;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void createStudent(Student student) {
        Optional<Student> studentOptional = studentRepository
                .findStudentByEmail(student.getEmail());

        if (studentOptional.isPresent()) {
            throw new IllegalStateException("email exists");
        }

        studentRepository.save(student);
    }

    public void deleteStudent(Long studentId) {
        boolean exists = studentRepository.existsById(studentId);
        if (!exists) {
            throw new IllegalStateException("student with that id is not exists");
        }
        studentRepository.deleteById(studentId);
    }

    @Transactional
    public void updatestudent(Long studentId, String name, String email) {
        Optional<Student> studentOptional = studentRepository.findById(studentId);

        if (studentOptional.isEmpty()) {
            throw  new IllegalStateException("Student with ID " + studentId + " does not exist");
        }

        Student student = studentOptional.get();

        if (name != null && !name.isEmpty() && !Objects.equals(student.getName(), name)) {
            student.setName(name);
        }

        if (email != null && !email.isEmpty() && !Objects.equals(student.getEmail(), email)) {
            Optional<Student> existingStudentWithEmail = studentRepository.findStudentByEmail(email);
            if (existingStudentWithEmail.isPresent() && !existingStudentWithEmail.get().getId().equals(studentId)) {
                throw new IllegalStateException("Email is already taken");
            }
            student.setEmail(email);
        }

        studentRepository.save(student);

    }
}
