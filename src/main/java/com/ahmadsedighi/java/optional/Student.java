package com.ahmadsedighi.java.optional;

import java.util.Optional;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 22/01/2022
 * Time: 10:14
 */

public class Student {
    Course course;

    public Student(Course course) {
        this.course = course;
    }

    public Optional<Course> getCourseAsOptional() {
        return Optional.ofNullable(course);
    }
}
