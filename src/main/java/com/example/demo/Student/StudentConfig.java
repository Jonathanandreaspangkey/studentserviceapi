package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository repository) {
//        return args -> {
//            Student jona = new Student(
//                    "jona",
//                    "jona@gmail.com",
//                    LocalDate.of(2000,01,5)
//            );
//
//            Student andreas = new Student(
//                    "andre",
//                    "andre@gmail.com",
//                    LocalDate.of(2001,01,5)
//            );
//
//            repository.saveAll(List.of(jona, andreas));
//        };
//    }
}
