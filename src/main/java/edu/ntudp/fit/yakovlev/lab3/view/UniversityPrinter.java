package edu.ntudp.fit.yakovlev.lab3.view;

import edu.ntudp.fit.yakovlev.lab3.model.*;

import java.util.List;

public class UniversityPrinter {

    public void printUniversityTree(University university) {
        Head head = university.getHead();
        System.out.println("└── " + university.getName()+ " University, Head: "+ head.getFirstName() + " " + head.getLastName());

        List<Faculty> faculties = university.getSubComponent();
        for (int i = 0; i < faculties.size(); i++) {
            Faculty faculty = faculties.get(i);
            boolean isLast = (i == faculties.size() - 1);
            printFacultyTree(faculty, (isLast ? "    " : "│   "));
        }
    }

    public void printFacultyTree(Faculty faculty, String prefix) {
        Head head = faculty.getHead();
        System.out.println(prefix + "└── " + faculty.getName() + " Faculty, Head: "+ head.getFirstName() + " " + head.getLastName());

        List<Department> departments = faculty.getSubComponent();
        for (int i = 0; i < departments.size(); i++) {
            Department department = departments.get(i);
            boolean isLast = (i == departments.size() - 1);
            printDepartmentTree(department, prefix + (isLast ? "    " : "│   "));
        }
    }

    public void printDepartmentTree(Department department, String prefix) {
        Head head = department.getHead();
        System.out.println(prefix + "└── " + department.getName() + " Department, Head: "+ head.getFirstName() + " " + head.getLastName());

        List<Group> groups = department.getSubComponent();
        for (int i = 0; i < groups.size(); i++) {
            Group group = groups.get(i);
            boolean isLast = (i == groups.size() - 1);
            printGroupTree(group, prefix + (isLast ? "    " : "│   "));
        }
    }

    public void printGroupTree(Group group, String prefix) {
        Head head = group.getHead();
        System.out.println(prefix + "└── " + group.getName() + " Group, Head: "+ head.getFirstName() + " " + head.getLastName());

        List<Student> students = group.getSubComponent();
        for (Student student : students) {
            System.out.println(prefix + "    └── " + student.getFirstName() + " " + student.getLastName() + " (Student)");
        }
    }
}



