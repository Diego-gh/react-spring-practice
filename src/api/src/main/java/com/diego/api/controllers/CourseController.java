package com.diego.api.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;

import com.diego.api.models.Course;


@RestController
@RequestMapping("/courses")
public class CourseController {
  private List<Course> courses = new ArrayList<>();

  public CourseController() {
      courses.add(new Course(1L, "Course 1", "Description 1"));
      courses.add(new Course(2L, "Course 2", "Description 2"));
  }

  @GetMapping
  public List<Course> getAllCourses() {
      return courses;
  }

  @GetMapping("/{id}")
  public Course getCourseById(@PathVariable Long id) {
      return courses.stream()
              .filter(course -> course.getId().equals(id))
              .findFirst()
              .orElse(null);
  }

  @PostMapping
  public Course createCourse(@RequestBody Course course) {
      courses.add(course);
      return course;
  }

  @DeleteMapping("/{id}")
  public void deleteCourse(@PathVariable Long id) {
      courses.removeIf(course -> course.getId().equals(id));
  }
}
