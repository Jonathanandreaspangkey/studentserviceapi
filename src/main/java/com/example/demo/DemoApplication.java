package com.example.demo;

import com.example.demo.Student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

//		Student student = new Student(1L, "John Doe", "john@example.com", LocalDate.of(2000, 5, 15));
//
//		// Print out the details of the student using toString() method
//		System.out.println("Student details:");
//		System.out.println(student.toString());
	}

}
