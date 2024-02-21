package edu.ntudp.fit.yakovlev.controller;

import edu.ntudp.fit.yakovlev.model.Group;
import edu.ntudp.fit.yakovlev.model.Head;
import edu.ntudp.fit.yakovlev.model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GroupCreator implements CompCreatableL<Group, Student>, CompCreatableM<Group, Student>{
    @Override
    public Group create(String name, Head head, List<Student> subComp) {
        if (subComp.isEmpty()){
            return null;
        }
        return new Group(name, subComp, head);
    }

    @Override
    public Group create(String name, Head head, Student... subComps) {
        if (subComps == null){
            return null;
        }
        List<Student> StudList = new ArrayList<>();
        Collections.addAll(StudList, subComps);
        return new Group(name, StudList, head);
    }
}
