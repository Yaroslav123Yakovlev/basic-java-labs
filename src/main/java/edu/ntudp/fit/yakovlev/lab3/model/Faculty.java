package edu.ntudp.fit.yakovlev.lab3.model;

import java.util.List;

public class Faculty extends UniversityComponent<Department> {

    public Faculty(String name, List<Department> subComponent, Head head) {
        super(name, subComponent, head);
    }
    public Faculty(String name, Department subComponent, Head head) {
        super(name, subComponent, head);
    }
}
