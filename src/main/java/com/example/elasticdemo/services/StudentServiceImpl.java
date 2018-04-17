package com.example.elasticdemo.services;

import com.example.elasticdemo.dto.StudentDTO;
import com.example.elasticdemo.models.Student;
import com.example.elasticdemo.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Iterable<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Iterable<Student> searchStudent(String query) {
        return studentRepository.searchByNameCustomQuery(query);
    }

    @Override
    public Iterable<Student> searchByName(String name) {
        return studentRepository.findByName(name);
    }

    @Override
    @Transactional
    public Student createStudent(StudentDTO studentDTO) {
        int id = (int)studentRepository.count() + 1;
        Student student = new Student(id, studentDTO.getName(), studentDTO.getAge());
        studentRepository.save(student);
        return student;
    }
}
