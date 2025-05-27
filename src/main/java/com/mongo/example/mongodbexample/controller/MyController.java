package com.mongo.example.mongodbexample.controller;

import com.mongo.example.mongodbexample.model.Student;
import com.mongo.example.mongodbexample.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class MyController {

    @Autowired
    private StudentRepository sr;

    
    
    @PostMapping
    public ResponseEntity<?> addStudent(@RequestBody Student student){

        Student savedUser = this.sr.save(student);
        return ResponseEntity.ok(savedUser);

    }

    @GetMapping
    public ResponseEntity<?> getStudent(){
        return ResponseEntity.ok(this.sr.findAll());

    }
}
