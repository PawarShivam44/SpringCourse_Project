package com.test.service;

import java.util.List;

import com.test.model.Course;

public interface CourseService {

	
	Course  getbyid(int id);
	Course  addCourseData(Course course);
	List<Course> allCourseData();
	Course  updateCourseDetail(Course  course);
	void deleteCourse(int id);
}
