package edu.ntudp.fit.yakovlev.lab4.controller;

import edu.ntudp.fit.yakovlev.lab4.model.Group;
import edu.ntudp.fit.yakovlev.lab4.model.Head;
import edu.ntudp.fit.yakovlev.lab4.model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GroupCreator implements UniversityComponentCreatable<Group, Student> {
    @Override
    public Group create(String name, Head head, List<Student> subComponentOfUniversity) {
        if (subComponentOfUniversity.isEmpty()){
            return null;
        }
        return new Group(name, subComponentOfUniversity, head);
    }

    @Override
    public Group create(String name, Head head, Student... subComponentsOfUniversity) {
        if (subComponentsOfUniversity == null){
            return null;
        }
        List<Student> StudentList = new ArrayList<>();
        Collections.addAll(StudentList, subComponentsOfUniversity);
        return new Group(name, StudentList, head);
    }
}