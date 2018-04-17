package com.example.elasticdemo.services;

import com.example.elasticdemo.dto.StudentDTO;
import com.example.elasticdemo.models.Student;

public interface StudentService {
    Iterable<Student> getStudents();

    Iterable<Student> searchStudent(String query);

    Iterable<Student> searchByName(String name);

    Student createStudent(StudentDTO studentDTO);
}
