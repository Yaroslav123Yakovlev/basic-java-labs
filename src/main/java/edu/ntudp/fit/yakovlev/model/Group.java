package edu.ntudp.fit.yakovlev.model;
import java.util.List;

public class Group extends UniverComp<Student>{

    public Group(String name, List<Student> subComp, Head head) {
        super(name, subComp, head);
    }
    public Group(String name, Student subComp, Head head) {
        super(name, subComp, head);
    }

}
