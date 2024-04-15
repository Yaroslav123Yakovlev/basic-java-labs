package edu.ntudp.fit.yakovlev.lab3.view;

import edu.ntudp.fit.yakovlev.lab3.model.*;

import java.util.List;

public class UniversityPrinter {
        public <T> void printUniversityComponentTree(UniversityComponent<T> component, String prefix) {
            Head head = component.getHead();
            System.out.printf("%s└── %s %s, Head: %s %s%n", prefix, component.getName(), component.getClass().getSimpleName(), head.getFirstName(), head.getLastName());

            List<T> subComponents = component.getSubComponent();
            for (T subComponent : subComponents) {
                String subPrefix = prefix + ("│   ");
                if (subComponent instanceof Student) {
                    printStudent((Student) subComponent, subPrefix);
                } else {
                    printUniversityComponentTree((UniversityComponent<T>) subComponent, subPrefix);
                }
            }
        }

        public void printStudent(Student student, String prefix) {
            System.out.printf("%s└── %s %s (Student)%n", prefix, student.getFirstName(), student.getLastName());
        }

    }



