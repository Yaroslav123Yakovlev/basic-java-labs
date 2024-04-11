package edu.ntudp.fit.yakovlev.lab3.view;

import edu.ntudp.fit.yakovlev.lab3.model.*;

import java.util.List;

public class UniversityPrinter {
        public void printUniversityComponentTree(UniversityComponent<?> component, String prefix) {
            Head head = component.getHead();
            System.out.printf("%s└── %s, Head: %s %s%n", prefix, component.getName(), head.getFirstName(), head.getLastName());

            List<?> subComponents = component.getSubComponent();
            for (Object subComponent : subComponents) {
                String subPrefix = prefix + ("│   ");
                if (subComponent instanceof Student) {
                    printStudent((Student) subComponent, subPrefix);
                } else {
                    printUniversityComponentTree((UniversityComponent<?>) subComponent, subPrefix);
                }
            }
        }

        public void printStudent(Student student, String prefix) {
            System.out.printf("%s└── %s %s (Student)%n", prefix, student.getFirstName(), student.getLastName());
        }

    }



