package com.example.studentmanagement.service;

import com.example.studentmanagement.entity.student;
import com.example.studentmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentservice {

    @Autowired
    private StudentRepository studentRepository;

    // Add student
    public student addStudent(student student) {
        return studentRepository.save(student);
    }

    // Get all students
    public List<student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Get student by ID
    public student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    // Update student
    public student updateStudent(Long id, student student) {

        student existingStudent = studentRepository.findById(id).orElse(null);

        if (existingStudent != null) {

            existingStudent.setName(student.getName());
            existingStudent.setEmail(student.getEmail());
            existingStudent.setAge(student.getAge());
            existingStudent.setCourse(student.getCourse());

            return studentRepository.save(existingStudent);
        }

        return null;
    }

    // Delete student
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}

