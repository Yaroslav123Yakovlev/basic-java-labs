package edu.ntudp.fit.yakovlev.lab3.view;

import edu.ntudp.fit.yakovlev.lab3.model.*;

public class UniversityPrinter {
    public void printUniversityTree(University university) {
        Head head = university.getHead();
        System.out.printf("└── %s University, Head: %s %s%n",
                university.getName(), head.getFirstName(), head.getLastName());

        for (Faculty faculty : university.getSubComponent()) {
            printFacultyTree(faculty, "    ");
        }
    }

    public void printFacultyTree(Faculty faculty, String prefix) {
        Head head = faculty.getHead();
        System.out.printf(prefix + "└── %s Faculty, Head: %s %s%n",
                faculty.getName(), head.getFirstName(), head.getLastName());

        for (Department department : faculty.getSubComponent()) {
            printDepartmentTree(department, prefix + "│   ");
        }
    }

    public void printDepartmentTree(Department department, String prefix) {
        Head head = department.getHead();
        System.out.printf(prefix + "└── %s Department, Head: %s %s%n",
                department.getName(), head.getFirstName(), head.getLastName());

        for (Group group : department.getSubComponent()) {
            printGroupTree(group, prefix + "│   ");
        }
    }

    public void printGroupTree(Group group, String prefix) {
        Head head = group.getHead();
        System.out.printf(prefix + "└── %s Group, Head: %s %s%n",
                group.getName(), head.getFirstName(), head.getLastName());

        for (Student student : group.getSubComponent()) {
            System.out.printf(prefix + "│    └── %s %s (Student)%n",
                    student.getFirstName(), student.getLastName());
        }
    }
}



