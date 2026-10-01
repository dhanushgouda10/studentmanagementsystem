package com.example.studentmanagement.service;
import com.example.studentmanagement.entity.student;
import com.example.studentmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public  class studentservice {

    @Autowired
    private StudentRepository studentRepository;

    public student addStudent(student student)
    {
        return studentRepository.save(student);
    }

    public List<student> getAllstudent()
    {
        return studentRepository.findAll();

    }




}

