package edu.ntudp.fit.yakovlev.lab3.controller;

import edu.ntudp.fit.yakovlev.lab3.model.Group;
import edu.ntudp.fit.yakovlev.lab3.model.Head;
import edu.ntudp.fit.yakovlev.lab3.model.Student;

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
        List<Student> studentList = new ArrayList<>();
        Collections.addAll(studentList, subComponentsOfUniversity);
        return new Group(name, studentList, head);
    }
}
