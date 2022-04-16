package com.persistance.persistence.Student;

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
            Student hugo = new Student("hugo","hugo@gmail.com",LocalDate.of(2002,Month.JANUARY,02));
            Student hubert=new Student("hubert","hubert@gmail.com",LocalDate.of(2021,Month.DECEMBER,04));

            repository.saveAll(List.of(hugo,hubert));
        };



    }
}
