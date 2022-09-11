package br.dev.a2.bootcampsre.course;

import br.dev.a2.bootcampsre.course.model.Course;
import br.dev.a2.bootcampsre.course.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    private CourseRepository repository;

    public CourseService(final CourseRepository repository) {
        this.repository = repository;
    }

    public List<Course> loadCourses() {
        return this.repository.findAll();
    }

    public void create(Course course) {
        this.repository.save(course);
    }
}
