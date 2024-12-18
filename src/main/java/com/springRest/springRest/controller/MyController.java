package com.springRest.springRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springRest.springRest.entity.Course;
import com.springRest.springRest.service.CourseService;

@RestController
public class MyController {
		
		@Autowired
		private CourseService courseService;
	
	    @GetMapping("/courses")
		public List<Course> getCourses(){
			return this.courseService.getCourses();
		}
	    
	    @GetMapping("/courses/{courseID}")
		public Course getCourse(@PathVariable String courseID){
			return this.courseService.getCourse(Long.parseLong(courseID));
		}
	    
	    @PostMapping("/courses")
	    public Course addCourse(@RequestBody Course course) {
	    	return this.courseService.addCourse(course);
	    }
	    
	    @PutMapping("/courses")
	    public Course updateCourse(@RequestBody Course course) {
	    	return this.courseService.updateCourse(course);
	    }
	    
	    @DeleteMapping("/courses/{courseID}")
		public Course deleteCourse(@PathVariable String courseID){
			return this.courseService.deleteCourse(Long.parseLong(courseID));
		}
	    
}
