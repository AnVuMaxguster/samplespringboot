package com.example.studentlist;

import com.google.gson.Gson;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("students")
public class Student {
    @Id
    private String id;
    private String name;
    private String age;
    private String school;

    public Student(String name, String age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    @Override
    public String toString() {
        return String.format(
                "Student[id=%s, name='%s', age='%s', school='%s']",
                id, name, age, school);
    }
}

