package com.example.demo.Student;

import io.micrometer.common.util.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;
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

    public Student getStudentById(Long studentId) {
        return  studentRepository.findById(studentId)
                .orElseThrow(() -> new NoSuchElementException("Student with that ID is not exists"));
    }

    public void createStudent(Student student) {
        String name = student.getName();
        String email = student.getEmail();
        if (StringUtils.isBlank(name) ||
                StringUtils.isBlank(email) ||
                student.getDob() == null) {
            throw new IllegalArgumentException("Name, email, and dob must be provided");
        }

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
    public void updateStudent(Long studentId, Student updatedStudent) {
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new IllegalStateException("Student with ID " + studentId + " does not exist"));

        String name = updatedStudent.getName();
        if (StringUtils.isNotBlank(name)) {
            student.setName(name);
        }

        String email = updatedStudent.getEmail();
        if (StringUtils.isNotBlank(email)) {
            Optional<Student> existingStudentWithEmail = studentRepository.findStudentByEmail(email);
            if (existingStudentWithEmail.isPresent() && !existingStudentWithEmail.get().getId().equals(studentId)) {
                throw new IllegalStateException("Email is already taken");
            }
            student.setEmail(email);
        }

        studentRepository.save(student);
    }
}
