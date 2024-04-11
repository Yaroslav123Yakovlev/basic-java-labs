package edu.ntudp.fit.yakovlev.lab3.view;

import edu.ntudp.fit.yakovlev.lab3.model.*;

import java.util.List;

public class UniversityPrinter {

    public void printUniversityTree(University University) {
        Head head = University.getHead();
        System.out.println("└── " + University.getName()+ " University, Head: "+ head.getFirstName() + " " + head.getLastName());

        List<Faculty> Faculties = University.getSubComponent();
        for (int i = 0; i < Faculties.size(); i++) {
            Faculty Faculty = Faculties.get(i);
            boolean isLast = (i == Faculties.size() - 1);
            printFacultyTree(Faculty, (isLast ? "    " : "│   "));
        }
    }

    public void printFacultyTree(Faculty Faculty, String prefix) {
        Head head = Faculty.getHead();
        System.out.println(prefix + "└── " + Faculty.getName() + " Faculty, Head: "+ head.getFirstName() + " " + head.getLastName());

        List<Department> Departments = Faculty.getSubComponent();
        for (int i = 0; i < Departments.size(); i++) {
            Department Department = Departments.get(i);
            boolean isLast = (i == Departments.size() - 1);
            printDepartmentTree(Department, prefix + (isLast ? "    " : "│   "));
        }
    }

    public void printDepartmentTree(Department Department, String prefix) {
        Head head = Department.getHead();
        System.out.println(prefix + "└── " + Department.getName() + " Department, Head: "+ head.getFirstName() + " " + head.getLastName());

        List<Group> Groups = Department.getSubComponent();
        for (int i = 0; i < Groups.size(); i++) {
            Group Group = Groups.get(i);
            boolean isLast = (i == Groups.size() - 1);
            printGroupTree(Group, prefix + (isLast ? "    " : "│   "));
        }
    }

    public void printGroupTree(Group Group, String prefix) {
        Head head = Group.getHead();
        System.out.println(prefix + "└── " + Group.getName() + " Group, Head: "+ head.getFirstName() + " " + head.getLastName());

        List<Student> Students = Group.getSubComponent();
        for (Student Student : Students) {
            System.out.println(prefix + "    └── " + Student.getFirstName() + " " + Student.getLastName() + " (Student)");
        }
    }
}



