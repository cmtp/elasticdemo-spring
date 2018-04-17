package com.example.elasticdemo.services;

import com.example.elasticdemo.models.Student;

import java.util.List;

public interface StudentService {
    Iterable<Student> getStudents();

    Iterable<Student> searchStudent(String query);

    Iterable<Student> searchByName(String name);
}
