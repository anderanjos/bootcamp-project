package br.dev.a2.bootcampsre.course.repository;

import br.dev.a2.bootcampsre.course.model.Course;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface CourseRepository {

    void save(Course course);

    List<Course> findAll();
}
