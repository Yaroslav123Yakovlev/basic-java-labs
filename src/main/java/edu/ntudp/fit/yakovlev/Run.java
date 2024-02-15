package edu.ntudp.fit.yakovlev;


import edu.ntudp.fit.yakovlev.controller.*;
import edu.ntudp.fit.yakovlev.model.*;
import edu.ntudp.fit.yakovlev.view.PrintUniver;

import java.util.List;

import static edu.ntudp.fit.yakovlev.model.Sex.FEMALE;
import static edu.ntudp.fit.yakovlev.model.Sex.MALE;

public class Run {
    public static void main(String[] args) {
        University univer1 = createTypicalUniversity();
        PrintUniver.printUniversityTree(univer1);
    }
    public static University createTypicalUniversity(){
        Head univerHead = new HeadCreator().create("Anne","A","A",FEMALE,"U1");
        Head facul1Head = new HeadCreator().create("Bob","B","B",MALE,"U2");
        Head facul2Head = new HeadCreator().create("Camila","C","C",FEMALE,"U3");
        Head depart1Head = new HeadCreator().create("David","D","D",MALE,"U4");
        Head depart2Head = new HeadCreator().create("Ella","E","E",FEMALE,"U5");
        Head depart3Head = new HeadCreator().create("Fred","F","F",MALE,"U6");
        Head depart4Head = new HeadCreator().create("Gabriella","G","G",FEMALE,"U7");
        Head group1Head = new HeadCreator().create("Harry","H","H",MALE,"U8");
        Head group2Head = new HeadCreator().create("Isla","I","I",FEMALE,"U9");
        Head group3Head = new HeadCreator().create("James","J","J",MALE,"U10");
        Head group4Head = new HeadCreator().create("Kaia","K","K",FEMALE,"U11");
        Head group5Head = new HeadCreator().create("Lincoln","L","L",MALE,"U12");
        Head group6Head = new HeadCreator().create("Maya","M","M",FEMALE,"U13");
        Head group7Head = new HeadCreator().create("Nathan","N","N",MALE,"U14");
        Head group8Head = new HeadCreator().create("Octavia","O","O",FEMALE,"U15");
        Student stud1 = new StudentCreator().create("John", "Doe", "Middle", MALE, "S001");
        Student stud2 = new StudentCreator().create("Alice", "Smith", "Anne", FEMALE, "S002");
        Student stud3 = new StudentCreator().create("Michael", "Johnson", "Lee", MALE, "S003");
        Student stud4 = new StudentCreator().create("Emma", "Brown", "Louise", FEMALE, "S004");
        Student stud5 = new StudentCreator().create("James", "Williams", "David", MALE, "S005");
        Student stud6 = new StudentCreator().create("Olivia", "Jones", "Grace", FEMALE, "S006");
        Student stud7 = new StudentCreator().create("William", "Taylor", "Edward", MALE, "S007");
        Student stud8 = new StudentCreator().create("Sophia", "Anderson", "Rose", FEMALE, "S008");
        Student stud9 = new StudentCreator().create("Alexander", "Jackson", "Michael", MALE, "S009");
        Student stud10 = new StudentCreator().create("Mia", "Thomas", "Elizabeth", FEMALE, "S010");
        Student stud11 = new StudentCreator().create("Ethan", "Harris", "Benjamin", MALE, "S011");
        Student stud12 = new StudentCreator().create("Ava", "White", "Nicole", FEMALE, "S012");
        Student stud13 = new StudentCreator().create("Liam", "Martinez", "Jose", MALE, "S013");
        Student stud14 = new StudentCreator().create("Isabella", "Garcia", "Maria", FEMALE, "S014");
        Student stud15 = new StudentCreator().create("Noah", "Rodriguez", "Daniel", MALE, "S015");
        Student stud16 = new StudentCreator().create("Charlotte", "Lopez", "Samantha", FEMALE, "S016");

        University univer = new UniversityCreator().create("DP NTU UA",univerHead,
                new FacultyCreator().create("Math",facul1Head,
                        new DepartmentCreator().create("Math-fis",depart1Head ,
                                new GroupCreator().create("51",group1Head,stud1,stud2),
                                new GroupCreator().create("52",group2Head,stud4,stud4)),
                        new DepartmentCreator().create("Math-bio",depart2Head,
                                new GroupCreator().create("53",group3Head,stud5,stud6),
                                new GroupCreator().create("54",group4Head,stud7,stud8))
                        ),
                new FacultyCreator().create("IT",facul2Head,
                        new DepartmentCreator().create("IT-Soft",depart3Head ,
                                new GroupCreator().create("121",group5Head,stud9,stud10),
                                new GroupCreator().create("122",group6Head,stud11,stud12)),
                        new DepartmentCreator().create("IT-Engineering",depart4Head,
                                new GroupCreator().create("123",group7Head,stud13,stud14),
                                new GroupCreator().create("124",group8Head,stud15,stud16))
                )
        );
        return univer;
    }
}




