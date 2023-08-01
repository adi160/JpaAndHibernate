package com.aditya.jpaandhibernate.course.springDataJpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aditya.jpaandhibernate.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
	
// We have to follow the naming convention for custom create method
	
	List<Course> findByAuthor(String author);

}
