package com.ahmadsedighi.java.optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public class UtilityTest {

    Utility utility = new Utility();

    @Test
    public void getStudentInstituteName_allInitialized_returnNormally(){
        String instituteName = "Alborz";
        Student student = new Student(new Course(new Institute(instituteName)));
        Assertions.assertEquals(instituteName, utility.getStudentInstituteNames(Optional.ofNullable(student)));
    }

    @Test
    public void getStudentInstituteName_nullInstituteName_returnUnknown(){
        Student student = new Student(new Course(new Institute(null)));
        Assertions.assertEquals("Unknown", utility.getStudentInstituteNames(Optional.ofNullable(student)));
    }

    @Test
    public void getStudentInstituteName_nullInstitute_returnUnknown(){
        Student student = new Student(new Course(null));
        Assertions.assertEquals("Unknown", utility.getStudentInstituteNames(Optional.ofNullable(student)));
    }

    @Test
    public void getStudentInstituteName_nullCourse_returnUnknown(){
        Student student = new Student(null);
        Assertions.assertEquals("Unknown", utility.getStudentInstituteNames(Optional.ofNullable(student)));
    }

    @Test
    public void getStudentInstituteName_nullPerson_returnUnknown(){
        Assertions.assertEquals("Unknown", utility.getStudentInstituteNames(Optional.ofNullable(null)));
    }

    @Test
    public void getStudentInstituteName_allInitialized_returnNormal(){
        List<Student> students = List.of(new Student(new Course(new Institute("Alborz"))),
                new Student(new Course(new Institute("Razi"))));
        Assertions.assertEquals(Set.of("Alborz", "Razi"), utility.getStudentInstituteNames(students));
    }
}
