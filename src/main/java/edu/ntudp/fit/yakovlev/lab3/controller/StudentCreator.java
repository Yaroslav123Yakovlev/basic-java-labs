package edu.ntudp.fit.yakovlev.lab3.controller;

import edu.ntudp.fit.yakovlev.lab3.model.Sex;
import edu.ntudp.fit.yakovlev.lab3.model.Student;

public class StudentCreator implements HumanCreatable<Student>{
    @Override
    public Student create(String firstName, String lastName, String middleName, Sex sex, String id) {
        return new Student(firstName, lastName, middleName, sex, id);
    }
}
