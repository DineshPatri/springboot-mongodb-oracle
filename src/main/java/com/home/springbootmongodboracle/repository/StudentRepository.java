package com.home.springbootmongodboracle.repository;

import com.home.springbootmongodboracle.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {

    public boolean existsByEmail(String email);
    public List<Student> findByEmail(String email);
    public void deleteByEmail(String email);

}
