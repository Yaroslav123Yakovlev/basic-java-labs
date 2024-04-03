package edu.ntudp.fit.yakovlev.lab3;

import edu.ntudp.fit.yakovlev.lab3.controller.UniversityCreator;
import edu.ntudp.fit.yakovlev.lab3.model.University;
import edu.ntudp.fit.yakovlev.lab3.view.PrintUniversity;

public class Run {
    public static void main(String[] args){

        University UniversityOne = new UniversityCreator().createTypicalUniversity();

        PrintUniversity PrintUniversity = new PrintUniversity();

        PrintUniversity.printUniversityTree(UniversityOne);

    }

}




