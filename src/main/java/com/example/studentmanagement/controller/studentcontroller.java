package com.example.studentmanagement.controller;

import com.example.studentmanagement.entity.student;
import com.example.studentmanagement.service.studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class studentcontroller {

    @Autowired
    private studentservice studentService;



    @PostMapping("/students")

    public student addStudent(@RequestBody student student)
    { return studentService.addStudent(student); }

    @GetMapping("/students")
    public List<student> getAllStudents() {
        return studentService.getAllStudents();
    }
    @GetMapping("/students/{id}")
    public student getStudentById(@PathVariable Long id)
    { return studentService.getStudentById(id); }

    @PutMapping("/students/{id}")
    public student updateStudent(@PathVariable Long id, @RequestBody student student)
    { return studentService.updateStudent(id, student); }

     @DeleteMapping("/students/{id}")
     public String deleteStudent(@PathVariable Long id)
     { studentService.deleteStudent(id); return "Student deleted successfully"; } }


