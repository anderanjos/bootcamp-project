package br.dev.a2.bootcampsre.course.repository;

import br.dev.a2.bootcampsre.course.model.Course;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CourseRepositoryImpl implements CourseRepository {

    private JdbcTemplate jdbcTemplate;

    public CourseRepositoryImpl(JdbcTemplate jdbc) {
        this.jdbcTemplate = jdbc;
    }


    @Override
    public void save(Course course) {
        var sql = "INSERT INTO course (course_id, name, description) values (?,?,?)";

        jdbcTemplate.update(sql,
                course.getCourse_id(),
                course.getName(),
                course.getDescription());
    }

    @Override
    public List<Course> findAll() {
        var query = "SELECT * FROM course";
        List<Course> courses = jdbcTemplate.query(query, (rs, rownum) -> {
            return new Course(rs.getLong("course_id"), rs.getString("name"), rs.getString("description"));
        });
        return courses;
    }
}
