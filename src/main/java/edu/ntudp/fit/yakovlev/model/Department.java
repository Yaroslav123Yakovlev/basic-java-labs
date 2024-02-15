package edu.ntudp.fit.yakovlev.model;
import java.util.List;

public class Department extends UniverComp<Group>{

    public Department(String name, List<Group> subComp, Head head) {
        super(name, subComp, head);
    }
    public Department(String name, Group subComp, Head head) {
        super(name, subComp, head);
    }
}
