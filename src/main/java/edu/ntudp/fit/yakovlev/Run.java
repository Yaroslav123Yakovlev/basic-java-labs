package edu.ntudp.fit.yakovlev;


import edu.ntudp.fit.yakovlev.controller.*;
import edu.ntudp.fit.yakovlev.model.*;
import edu.ntudp.fit.yakovlev.view.PrintUniver;

import java.io.IOException;

import static edu.ntudp.fit.yakovlev.model.Sex.FEMALE;
import static edu.ntudp.fit.yakovlev.model.Sex.MALE;

public class Run {
    public static void main(String[] args) throws IOException {
        University univer1 = createTypicalUniversity();
        PrintUniver.printUniversityTree(univer1);

        JsonManager jsonManager = new JsonManager();
        jsonManager.writeToJson(univer1,"json1");
        University univer2 = JsonManager.readFromJson("json1");
        
        PrintUniver.printUniversityTree(univer2);
    }
    public static University createTypicalUniversity(){
        HeadCreator head = new HeadCreator();
        StudentCreator student = new StudentCreator();
        GroupCreator group = new GroupCreator();
        DepartmentCreator depart = new DepartmentCreator();
        FacultyCreator facult =new FacultyCreator();

        Head univerHead = head.create("Anne","A","A",FEMALE,"U1");
        Head facul1Head = head.create("Bob","B","B",MALE,"U2");
        Head facul2Head = head.create("Camila","C","C",FEMALE,"U3");
        Head depart1Head = head.create("David","D","D",MALE,"U4");
        Head depart2Head = head.create("Ella","E","E",FEMALE,"U5");
        Head depart3Head = head.create("Fred","F","F",MALE,"U6");
        Head depart4Head = head.create("Gabriella","G","G",FEMALE,"U7");
        Head group1Head = head.create("Harry","H","H",MALE,"U8");
        Head group2Head = head.create("Isla","I","I",FEMALE,"U9");
        Head group3Head = head.create("James","J","J",MALE,"U10");
        Head group4Head = head.create("Kaia","K","K",FEMALE,"U11");
        Head group5Head = head.create("Lincoln","L","L",MALE,"U12");
        Head group6Head = head.create("Maya","M","M",FEMALE,"U13");
        Head group7Head = head.create("Nathan","N","N",MALE,"U14");
        Head group8Head = head.create("Octavia","O","O",FEMALE,"U15");
        Student stud1 = student.create("John", "Doe", "Middle", MALE, "S001");
        Student stud2 = student.create("Alice", "Smith", "Anne", FEMALE, "S002");
        Student stud3 = student.create("Michael", "Johnson", "Lee", MALE, "S003");
        Student stud4 = student.create("Emma", "Brown", "Louise", FEMALE, "S004");
        Student stud5 = student.create("James", "Williams", "David", MALE, "S005");
        Student stud6 = student.create("Olivia", "Jones", "Grace", FEMALE, "S006");
        Student stud7 = student.create("William", "Taylor", "Edward", MALE, "S007");
        Student stud8 = student.create("Sophia", "Anderson", "Rose", FEMALE, "S008");
        Student stud9 = student.create("Alexander", "Jackson", "Michael", MALE, "S009");
        Student stud10 = student.create("Mia", "Thomas", "Elizabeth", FEMALE, "S010");
        Student stud11 = student.create("Ethan", "Harris", "Benjamin", MALE, "S011");
        Student stud12 = student.create("Ava", "White", "Nicole", FEMALE, "S012");
        Student stud13 = student.create("Liam", "Martinez", "Jose", MALE, "S013");
        Student stud14 = student.create("Isabella", "Garcia", "Maria", FEMALE, "S014");
        Student stud15 = student.create("Noah", "Rodriguez", "Daniel", MALE, "S015");
        Student stud16 = student.create("Charlotte", "Lopez", "Samantha", FEMALE, "S016");

        University univer = new UniversityCreator().create("DP NTU UA",univerHead,
                facult.create("Math",facul1Head,
                        depart.create("Math-fis",depart1Head ,
                                group.create("51",group1Head,stud1,stud2),
                                group.create("52",group2Head,stud4,stud4)),
                        depart.create("Math-bio",depart2Head,
                                group.create("53",group3Head,stud5,stud6),
                                group.create("54",group4Head,stud7,stud8))
                        ),
                facult.create("IT",facul2Head,
                        depart.create("IT-Soft",depart3Head ,
                                group.create("121",group5Head,stud9,stud10),
                                group.create("122",group6Head,stud11,stud12)),
                        depart.create("IT-Engineering",depart4Head,
                                group.create("123",group7Head,stud13,stud14),
                                group.create("124",group8Head,stud15,stud16))
                )
        );
        return univer;
    }
}




