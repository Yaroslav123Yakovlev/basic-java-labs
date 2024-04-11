package edu.ntudp.fit.yakovlev.lab3.model;

import java.util.List;

public class Department extends UniversityComponent<Group> {

    public Department(String name, List<Group> subComponent, Head head) {
        super(name, subComponent, head);
    }
    public Department(String name, Group subComponent, Head head) { super(name, subComponent, head);}
}
