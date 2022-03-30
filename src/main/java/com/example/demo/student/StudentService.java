package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service // Could also be @Component
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(1L,
                        "John",
                        "demo@gmail.com",
                        22, LocalDate.of(2000, Month.NOVEMBER,1) )
        );
    }
}
