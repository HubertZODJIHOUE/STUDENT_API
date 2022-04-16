package com.persistance.persistence.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

import java.util.List;


@Configuration
public class StudentConfig {

@Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return  args -> {
            Student mariame= new Student(
                    "mariame",
                    "mariam@gmail.com",
                    LocalDate.of(2026, Month.AUGUST,02 )
            );

            Student hubert= new Student(
                    "hubert",
                    "mariam@gmail.com",
                    LocalDate.of(2022, Month.AUGUST,02 )
            );


        repository.saveAll(List.of(mariame,hubert));
        };

    }

}
