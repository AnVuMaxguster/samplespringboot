package com.example.web;

import com.example.add.AddService;
import com.example.studentlist.Student;
import com.example.studentlist.StudentRepository;
import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class Main {
    @GetMapping("/")
    String home() {
        return "Testing SpringBoot RESTful API:\n."+
                "Integer calculation: /add/{num1}/{num2}\n";
    }

    private final AddService addService = new AddService();

    @GetMapping("/add/{num1}/{num2}")
    Integer add(@PathVariable int num1, @PathVariable int num2){
        return addService.result(num1,num2);
    }

    private StudentRepository studentRepository;
    @PostMapping("/fill")
    String fill_student(@RequestBody String jsonString){
        Gson gson = new Gson();
        Student student = gson.fromJson(jsonString, Student.class);
        return student.toString();
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}