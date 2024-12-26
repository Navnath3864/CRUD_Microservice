package com.client.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.client.model.Student;

@Repository
public interface CreateRepo extends JpaRepository<Student, Integer>{

}
