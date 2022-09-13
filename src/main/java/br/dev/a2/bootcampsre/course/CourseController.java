package br.dev.a2.bootcampsre.course;

import br.dev.a2.bootcampsre.course.model.Course;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    private CourseService service;

    public CourseController(CourseService service) {
        this.service = service;
    }


    @GetMapping("/course")
    public ResponseEntity<Iterable<Course>> retrieveCourses(){
        var courses = this.service.loadCourses();
        return ResponseEntity.ok(courses);
    }

    @PostMapping("/course")
    public ResponseEntity<Void> saveCourse(@RequestBody Course course){
        this.service.create(course);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
