package edu.ntudp.fit.yakovlev.lab3.model;

public class Student extends Human{
    private String studentId;

    public Student(String firstName, String lastName, String middleName, Sex sex, String studentId) {
        super(firstName, lastName, middleName, sex);
        this.studentId = studentId;
    }
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

}
