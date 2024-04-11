package edu.ntudp.fit.yakovlev.lab3;

import edu.ntudp.fit.yakovlev.lab4.controller.UniversityCreator;
import edu.ntudp.fit.yakovlev.lab4.model.University;
import edu.ntudp.fit.yakovlev.lab4.view.UniversityPrinter;

public class Run {
    public static void main(String[] args){

        University universityOne = new UniversityCreator().createTypicalUniversity();

        UniversityPrinter universityPrinter = new UniversityPrinter();

        universityPrinter.printUniversityTree(universityOne);

    }

}




