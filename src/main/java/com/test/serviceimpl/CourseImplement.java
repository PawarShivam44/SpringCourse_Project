package com.test.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.model.Course;
import com.test.repository.CourseRepository;
import com.test.service.CourseService;

@Service
public class CourseImplement implements CourseService{

	@Autowired
	CourseRepository repository;

	public CourseImplement(CourseRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Course getbyid(int id) {
		return repository.findById(id).get();
	}

	@Override
	public Course addCourseData(Course course) {
		return repository.save(course);
	}

	@Override
	public List<Course> allCourseData() {
		return repository.findAll();
	}

	@Override
	public Course updateCourseDetail(Course course) {
		return repository.save(course);
	}

	@Override
	public void deleteCourse(int id) {
		repository.deleteById(id);
	}
	
	
}
