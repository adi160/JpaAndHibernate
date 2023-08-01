package com.aditya.jpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.aditya.jpaandhibernate.course.springDataJpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	private CourseJdbcRepository repository;
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
//	@Override
//	public void run(String... args) throws Exception {
//		repository.insert(new Course(1,"learn AWS Jpa","udemy"));
//		repository.insert(new Course(2,"learn Azure Jpa","coursera"));
//		repository.insert(new Course(3,"learn DevOps Jpa","youtube"));
//		
//		repository.deleteById(3);
//		
//		System.out.println(repository.findById(1));
//		System.out.println(repository.findById(2));
	
	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1,"learn AWS SpringJpa","udemy"));
		repository.save(new Course(2,"learn Azure SpringJpa","coursera"));
		repository.save(new Course(3,"learn DevOps SpringJpa","youtube"));
		
		repository.deleteById(3l);
		
		System.out.println(repository.findById(1l));
		System.out.println(repository.findById(2l));
		
		System.out.println(repository.findByAuthor("coursera"));
	}

}
