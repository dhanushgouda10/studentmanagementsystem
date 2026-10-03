package com.example.studentmanagement.controller;

import com.example.studentmanagement.entity.student;
import com.example.studentmanagement.service.studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class studentcontroller {

    @Autowired
    private studentservice studentService;



    @PostMapping("/student")
    public student addStudent(@Valid @RequestBody student student)
    { return studentService.addStudent(student); }

    @GetMapping("/student")
    public List<student> getAllStudents() {
        return studentService.getAllStudents();
    }
    @GetMapping("/student/{id}")
    public student getStudentById(@PathVariable Long id)
    { return studentService.getStudentById(id); }

    @PutMapping("/student/{id}")
    public student updateStudent(@PathVariable Long id, @Valid @RequestBody student student)
    { return studentService.updateStudent(id, student); }

     @DeleteMapping("/student/{id}")
     public String deleteStudent(@PathVariable Long id)
     { studentService.deleteStudent(id); return "Student deleted successfully"; } }


