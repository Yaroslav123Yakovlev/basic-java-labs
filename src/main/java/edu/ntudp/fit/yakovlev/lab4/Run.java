package edu.ntudp.fit.yakovlev.lab4;


import edu.ntudp.fit.yakovlev.lab4.controller.UniversityCreator;
import edu.ntudp.fit.yakovlev.lab4.model.University;
import edu.ntudp.fit.yakovlev.lab4.view.UniversityPrinter;

public class Run {

    private static final int SYMBOLS_FILLER = 80;

    public static void main(String[] args){
        System.out.println("-".repeat(SYMBOLS_FILLER));
        System.out.println("Old University Structure:");
        System.out.println("-".repeat(SYMBOLS_FILLER));

        University oldUniversity = new UniversityCreator().createTypicalUniversity();
        UniversityPrinter universityPrinter = new UniversityPrinter();
        universityPrinter.printUniversityTree(oldUniversity);

        System.out.println("-".repeat(SYMBOLS_FILLER));
        System.out.println("New University Structure:");
        System.out.println("-".repeat(SYMBOLS_FILLER));

        JsonManager JsonManager = new JsonManager();
        JsonManager.writeToJson(oldUniversity,"json1");
        University newUniversity = JsonManager.readFromJson("json1");

        universityPrinter.printUniversityTree(newUniversity);
    }

}



