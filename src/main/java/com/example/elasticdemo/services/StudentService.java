package com.example.elasticdemo.services;

import com.example.elasticdemo.models.Student;

public interface StudentService {
    Iterable<Student> getStudents();
}
