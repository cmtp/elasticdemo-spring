package com.example.elasticdemo.controllers;

import com.example.elasticdemo.dto.StudentDTO;
import com.example.elasticdemo.models.Student;
import com.example.elasticdemo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = {"http://localhost:8100", "*"})
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

    @RequestMapping("/students/search")
    public ResponseEntity<Map<String,Object>> getSearchStudent(@RequestParam String query) {
        Map<String, Object> mapResponse = new HashMap<String, Object>();
        mapResponse.put("status", "ok");
        Iterable<Student> res = studentService.searchStudent(query);
        List<Student> students = new ArrayList<Student>();
        for (Student s: res) {
            students.add(s);
        }
        mapResponse.put("students", students);
        return new ResponseEntity<Map<String, Object>>(mapResponse, HttpStatus.OK);
    }

    @PostMapping("/students")
    public ResponseEntity<Map<String, Object>> createStudent(@RequestBody StudentDTO studentDTO) {
        Map<String, Object> mapResponse = new HashMap<String, Object>();
        mapResponse.put("status", "created");
        studentService.createStudent(studentDTO);
        return new ResponseEntity<Map<String, Object>>(mapResponse, HttpStatus.OK);
    }
}
