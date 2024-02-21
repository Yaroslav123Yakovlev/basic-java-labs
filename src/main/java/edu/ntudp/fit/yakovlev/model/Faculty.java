package edu.ntudp.fit.yakovlev.model;
import java.util.List;

public class Faculty extends UniverComp<Department>{

    public Faculty(String name, List<Department> subComp, Head head) {
        super(name, subComp, head);
    }
    public Faculty(String name, Department subComp, Head head) {
        super(name, subComp, head);
    }
}
