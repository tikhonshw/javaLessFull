package com.itProgerT3L4;

import java.io.Serializable;

public class Course implements Serializable {

    private String title;
    private int id;

    public Course(int id, String title) {
        this.title = title;
        this.id = id;
    }

    @Override
    public String toString() {
        return id + " - " + title;

    }
    public boolean equals(Object obj) {
        Course course = (Course) obj;
        return id == course.id;
    }
}
