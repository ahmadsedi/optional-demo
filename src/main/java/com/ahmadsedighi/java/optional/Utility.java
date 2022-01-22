package com.ahmadsedighi.java.optional;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 22/01/2022
 * Time: 10:14
 *
 * Utility to explain how to use Optional class to get rid of NullPointerException
 * It assumes a Student/Course/Institute model
 *
 */
public class Utility
{

    /**
     * Accepts a list of Students and returns a distinct list of institute names for those students.
     * @param students as a list of Students
     * @return a set of institute names
     */
    public Set<String> getStudentInstituteNames(List<Student> students){
        return students.stream().map(Student::getCourseAsOptional)
                .map(optionalCourse->optionalCourse.flatMap(Course::getInstituteAsOptional))
                .map(optionalInstitute->optionalInstitute.flatMap(Institute::getNameAsOptional))
                .flatMap(Optional::stream)
                .collect(Collectors.toSet());
    }

    /**
     * Receives an Optional<Student> object and returns its associated institute name, or "Unknown" if no institute
     * exists.
     * @param student
     * @return
     */
    public String getStudentInstituteNames(Optional<Student> student){
        return student.flatMap(Student::getCourseAsOptional)
                .flatMap(Course::getInstituteAsOptional)
                .flatMap(Institute::getNameAsOptional).orElse("Unknown");
    }
}
