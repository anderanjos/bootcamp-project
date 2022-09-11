package br.dev.a2.bootcampsre.course.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class Course {
    private Long course_id;
    private String name;
    private String description;

    public Course(Long course_id, String name, String description) {
        this.course_id = course_id;
        this.name = name;
        this.description = description;
    }
}
