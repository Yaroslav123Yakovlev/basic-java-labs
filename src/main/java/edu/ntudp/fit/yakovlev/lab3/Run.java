package edu.ntudp.fit.yakovlev.lab3;

import edu.ntudp.fit.yakovlev.lab3.controller.UniversityCreator;
import edu.ntudp.fit.yakovlev.lab3.model.University;
import edu.ntudp.fit.yakovlev.lab3.view.UniversityPrinter;

public class Run {
    public static void main(String[] args){
        University universityOne = new UniversityCreator().createTypicalUniversity();
        new UniversityPrinter().printUniversityTree(universityOne);
    }
}