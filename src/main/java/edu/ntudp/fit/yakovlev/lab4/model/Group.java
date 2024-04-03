package edu.ntudp.fit.yakovlev.lab4.model;

import java.util.List;

public class Group extends UniversityComponent<Student> {

    public Group(String name, List<Student> subComponent, Head head) {
        super(name, subComponent, head);
    }
    public Group(String name, Student subComponent, Head head) {
        super(name, subComponent, head);
    }

}
