package edu.ntudp.fit.yakovlev.controller;

import edu.ntudp.fit.yakovlev.model.Department;
import edu.ntudp.fit.yakovlev.model.Group;
import edu.ntudp.fit.yakovlev.model.Head;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DepartmentCreator implements CompCreatableL<Department, Group>, CompCreatableM<Department, Group>{

    @Override
    public Department create(String name, Head head, List<Group> subComp) {
        if (subComp.isEmpty()){
            return null;
        }
        return new Department(name, subComp, head);
    }

    @Override
    public Department create(String name, Head head, Group... subComps) {
        if (subComps == null){
            return null;
        }
        List<Group> GroupList = new ArrayList<>();
        Collections.addAll(GroupList, subComps);
        return new Department(name, GroupList, head);
    }
}
