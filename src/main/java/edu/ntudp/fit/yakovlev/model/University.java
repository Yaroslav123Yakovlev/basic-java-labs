package edu.ntudp.fit.yakovlev.model;
import java.util.List;

public class University extends UniverComp<Faculty>{

    public University(String name, List<Faculty> subComp, Head head) {
        super(name, subComp, head);
    }
    public University(String name, Faculty subComp, Head head) {
        super(name, subComp, head);
    }
}
