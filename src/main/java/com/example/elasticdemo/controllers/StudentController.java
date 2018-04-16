package com.example.elasticdemo.controllers;

import com.example.elasticdemo.models.Student;
import com.example.elasticdemo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/rest")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("/students")
    public ResponseEntity<Map<String, Object>> getStudentsByCustomQuery() {
        Map<String, Object> mapResponse = new HashMap<String, Object>();
        mapResponse.put("status", "ok");
        Iterable<Student> res = studentService.getStudents();
        List<Student> students = new ArrayList<Student>();
        for (Student s: res) {
            students.add(s);
        }
        mapResponse.put("students", students);
        return new ResponseEntity<Map<String, Object>>(mapResponse, HttpStatus.OK);
    }
}
