package com.home.springbootmongodboracle.repository;

import com.home.springbootmongodboracle.document.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends MongoRepository<Course,String> {
    public List<Course> findCourseByEmail(String email);
    public void deleteByEmail(String email);
}
