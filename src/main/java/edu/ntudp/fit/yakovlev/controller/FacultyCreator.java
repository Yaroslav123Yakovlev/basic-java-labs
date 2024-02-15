package edu.ntudp.fit.yakovlev.controller;

import edu.ntudp.fit.yakovlev.model.Department;
import edu.ntudp.fit.yakovlev.model.Faculty;
import edu.ntudp.fit.yakovlev.model.Head;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FacultyCreator implements CompCreatableL<Faculty, Department>, CompCreatableM<Faculty, Department>{
    @Override
    public Faculty create(String name, Head head, List<Department> subComp) {
        if (subComp.isEmpty()){
            return null;
        }
        return new Faculty(name, subComp, head);
    }

    @Override
    public Faculty create(String name, Head head, Department... subComps) {
        if (subComps == null){
            return null;
        }
        List<Department> DepartmentList = new ArrayList<>();
        Collections.addAll(DepartmentList, subComps);
        return new Faculty(name, DepartmentList, head);
    }
}
