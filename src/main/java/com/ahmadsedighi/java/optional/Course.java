package com.ahmadsedighi.java.optional;

import java.util.Optional;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 22/01/2022
 * Time: 10:13
 */

public class Course {
    Institute institute;

    public Course(Institute institute) {
        this.institute = institute;
    }

    public Optional<Institute> getInstituteAsOptional() {
        return Optional.ofNullable(institute);
    }
}
