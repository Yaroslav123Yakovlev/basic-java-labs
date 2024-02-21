package edu.ntudp.fit.yakovlev.controller;

import edu.ntudp.fit.yakovlev.model.Sex;
import edu.ntudp.fit.yakovlev.model.Student;

public class StudentCreator implements HumanCreatable<Student>{
    @Override
    public Student create(String firstName, String lastName, String middleName, Sex sex, String id) {
        return new Student(firstName, lastName, middleName, sex, id);
    }
}
