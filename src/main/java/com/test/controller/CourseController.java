package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.Course;
import com.test.service.CourseService;

@RestController
public class CourseController {
	@Autowired
	CourseService service;

	public CourseController(CourseService service) {
		super();
		this.service = service;
	}

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to My Course Details Project";
	}
	
	@PostMapping("/add")
	public Course addCourse(@RequestBody Course course) {
		return service.addCourseData(course);
	}
	@GetMapping("/all")
	public List<Course> allCourseDetails(){
		return service.allCourseData();
	}
	
	@GetMapping("/data/{id}")
	public Course courseByIdData(@PathVariable int id) {
		return service.getbyid(id);
	}
	
	@PutMapping("/edit/{id}")
	public Course updateCoursedata(@RequestBody Course course,@PathVariable int id) {
		return service.updateCourseDetail(course);
	}
	
	@DeleteMapping("/del/{id}")
	public void deleteCourse(@PathVariable int id) {
		service.deleteCourse(id);
	}
	
	
	
}
