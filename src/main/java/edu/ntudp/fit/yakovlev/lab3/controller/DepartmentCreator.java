package edu.ntudp.fit.yakovlev.lab3.controller;

import edu.ntudp.fit.yakovlev.lab3.model.Department;
import edu.ntudp.fit.yakovlev.lab3.model.Group;
import edu.ntudp.fit.yakovlev.lab3.model.Head;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DepartmentCreator implements UniversityComponentCreatable<Department, Group>{

    @Override
    public Department create(String name, Head head, List<Group> subComponentOfUniversity) {
        if (subComponentOfUniversity.isEmpty()){
            return null;
        }
        return new Department(name, subComponentOfUniversity, head);
    }

    @Override
    public Department create(String name, Head head, Group... subComponentsOfUniversity) {
        if (subComponentsOfUniversity == null){
            return null;
        }
        List<Group> GroupList = new ArrayList<>();
        Collections.addAll(GroupList, subComponentsOfUniversity);
        return new Department(name, GroupList, head);
    }
}
