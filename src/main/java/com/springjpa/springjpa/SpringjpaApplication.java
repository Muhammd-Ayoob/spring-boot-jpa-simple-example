package com.springjpa.springjpa;


import com.springjpa.springjpa.dao.StudentRepository;
import com.springjpa.springjpa.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringjpaApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringjpaApplication.class, args);

      StudentRepository studentRepository =  context.getBean(StudentRepository.class);


        Student student = new Student();

        student.setName("Ayoob");
        student.setRollNo("18CS85");

        Student student1 = studentRepository.save(student);

        System.out.println("HELLO SPRING BOOT JPA"+student1);
    }

}
