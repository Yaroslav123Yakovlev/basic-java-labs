package edu.ntudp.fit.yakovlev.lab3.controller;

import edu.ntudp.fit.yakovlev.lab3.model.Department;
import edu.ntudp.fit.yakovlev.lab3.model.Faculty;
import edu.ntudp.fit.yakovlev.lab3.model.Head;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FacultyCreator implements UniversityComponentCreatable<Faculty, Department> {
    @Override
    public Faculty create(String name, Head head, List<Department> subComponentOfUniversity) {
        if (subComponentOfUniversity.isEmpty()){
            return null;
        }
        return new Faculty(name, subComponentOfUniversity, head);
    }

    @Override
    public Faculty create(String name, Head head, Department... subComponentsOfUniversity) {
        if (subComponentsOfUniversity == null){
            return null;
        }
        List<Department> DepartmentList = new ArrayList<>();
        Collections.addAll(DepartmentList, subComponentsOfUniversity);
        return new Faculty(name, DepartmentList, head);
    }
}
