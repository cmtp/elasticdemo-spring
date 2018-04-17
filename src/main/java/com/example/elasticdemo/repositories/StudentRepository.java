package com.example.elasticdemo.repositories;

import java.util.List;

import com.example.elasticdemo.models.Student;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends ElasticsearchRepository<Student,Long>
{
    List<Student> findByName(String name);
    
    List<Student> findByAge(int age);

    @Query("{\"query\" : {\"prefix\" : {\"_all\" : \"?0\"}}}")
    Iterable<Student> searchByNameCustomQuery(String query);

}