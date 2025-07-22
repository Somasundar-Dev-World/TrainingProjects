package com.example.TrainingDemo.controller;

import com.example.TrainingDemo.model.Student;
import com.example.TrainingDemo.model.StudentSaveResponse;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/student-demo")
public class StudentController {

    private Map<String, Student> studentMap = new HashMap<>();

    @PostMapping("/saveStudent")
    public StudentSaveResponse saveStudent(@RequestBody Student student) {

        System.out.println("Received Student Details: " + student.getName() + ", Age: " + student.getAge() + ", Email: " + student.getEmail());

        studentMap.put(student.getName(), student);
        System.out.println("Student saved successfully!");

        StudentSaveResponse response = new StudentSaveResponse("Success", "Student details saved successfully");
        return response;
    }

    @GetMapping("/getStudentDetails")
    public Student getStudentDetails() {

        Student student = new Student("John Doe", 20, "john.test@gmail.com");
        return student;
    }

    @GetMapping("/getAllStudents")
    public Map<String, Student> getAllStudentDetails() {
        return studentMap;
    }

    @GetMapping("/getStudentByName/{name}")
    public Student getStudentByName(@PathVariable String name) {

        Student student = studentMap.get(name);

        return student;
    }
}
