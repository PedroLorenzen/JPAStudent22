package com.example.jpastudent22.repositories;

import com.example.jpastudent22.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
