package edu.ntudp.fit.yakovlev.lab4;


import edu.ntudp.fit.yakovlev.lab4.controller.UniversityCreator;
import edu.ntudp.fit.yakovlev.lab4.model.University;
import edu.ntudp.fit.yakovlev.lab4.view.PrintUniversity;

public class Run {
    public static void main(String[] args){
        System.out.println("-".repeat(80));
        System.out.println("Old University Structure:");
        System.out.println("-".repeat(80));

        University UniversityOne = new UniversityCreator().createTypicalUniversity();
        PrintUniversity PrintUniversity = new PrintUniversity();
        PrintUniversity.printUniversityTree(UniversityOne);

        System.out.println("-".repeat(80));
        System.out.println("New University Structure:");
        System.out.println("-".repeat(80));

        JsonManager JsonManager = new JsonManager();
        JsonManager.writeToJson(UniversityOne,"json1");
        University UniversityTwo = JsonManager.readFromJson("json1");

        PrintUniversity.printUniversityTree(UniversityTwo);

    }

}




