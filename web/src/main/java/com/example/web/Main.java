package com.example.web;

import com.example.add.AddService;
import com.example.palindrome.PalindromeSvc;
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
    private String home() {
        return  "Available endpoints:\n"+
                "/add/{num1}/{num2}\n"+
                "/fill ( requires body )\n"+
                "/palindrome/{text}";
    }

    private final AddService addService = new AddService();
    @GetMapping("/add/{num1}/{num2}")
    private int add_numbers(@PathVariable int num1, @PathVariable int num2){
        return addService.result(num1,num2);
    }

    // TO-DO: update
    private StudentRepository studentRepository;
    @PostMapping("/fill")
    private String fill_students_info(@RequestBody String jsonString){
        Gson gson = new Gson();
        Student student = gson.fromJson(jsonString, Student.class);
        return student.toString();
    }

    private final PalindromeSvc palindromeSvc = new PalindromeSvc();
    @GetMapping("/palindrome/{text}")
    private String check_palindrome(@PathVariable String text){
        if(palindromeSvc.isPalindrome(text))
            return "Yes";
        else
            return "No";
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}