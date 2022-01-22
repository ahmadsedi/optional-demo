package com.ahmadsedighi.java.optional;

import java.util.Optional;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 22/01/2022
 * Time: 10:13
 */

public class Institute {
    String name;

    public Institute(String name) {
        this.name = name;
    }

    public Optional<String> getNameAsOptional(){
        return Optional.ofNullable(name);
    }
}
