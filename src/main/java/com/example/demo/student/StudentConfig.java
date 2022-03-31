package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.MARCH;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->{
            Student john = new Student("John",
                    "john@gmail.com",
                    LocalDate.of(1993, Month.OCTOBER, 27)
                    );

            Student james = new Student("John",
                    "james@gmail.com",
                    LocalDate.of(2001, MARCH, 3)
            );

            repository.saveAll(
                    List.of(john, james)
            );
        };
    }
}
