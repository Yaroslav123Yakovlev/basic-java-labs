package edu.ntudp.fit.yakovlev.lab4.controller;

import edu.ntudp.fit.yakovlev.lab4.model.Faculty;
import edu.ntudp.fit.yakovlev.lab4.model.Head;
import edu.ntudp.fit.yakovlev.lab4.model.Student;
import edu.ntudp.fit.yakovlev.lab4.model.University;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static edu.ntudp.fit.yakovlev.lab4.model.Sex.FEMALE;
import static edu.ntudp.fit.yakovlev.lab4.model.Sex.MALE;

public class UniversityCreator implements UniversityComponentCreatable<University, Faculty> {

    @Override
    public University create(String name, Head head, List<Faculty> subComponentOfUniversity) {
        if (subComponentOfUniversity.isEmpty()){
            return null;
        }
        return new University(name, subComponentOfUniversity, head);
    }

    @Override
    public University create(String name, Head head, Faculty... subComponentsOfUniversity) {
        if (subComponentsOfUniversity == null){
            return null;
        }
        List<Faculty> FacultyList = new ArrayList<>();
        Collections.addAll(FacultyList, subComponentsOfUniversity);
        return new University(name, FacultyList, head);
    }

    public University createTypicalUniversity(){
        HeadCreator HeadCreator = new HeadCreator();
        StudentCreator StudentCreator = new StudentCreator();
        GroupCreator GroupCreator = new GroupCreator();
        DepartmentCreator DepartmentCreator = new DepartmentCreator();
        FacultyCreator FacultyCreator = new FacultyCreator();

        Head UniversityHead = HeadCreator.create("Anne","A","A",FEMALE,"U1");
        Head FacultyFirstHead = HeadCreator.create("Bob","B","B",MALE,"U2");
        Head FacultySecondHead = HeadCreator.create("Camila","C","C",FEMALE,"U3");
        Head DepartmentFirstHead = HeadCreator.create("David","D","D",MALE,"U4");
        Head DepartmentSecondHead = HeadCreator.create("Ella","E","E",FEMALE,"U5");
        Head DepartmentThirdHead = HeadCreator.create("Fred","F","F",MALE,"U6");
        Head DepartmentFourthHead = HeadCreator.create("Gabriella","G","G",FEMALE,"U7");
        Head GroupFirstHead = HeadCreator.create("Harry","H","H",MALE,"U8");
        Head GroupSecondHead = HeadCreator.create("Isla","I","I",FEMALE,"U9");
        Head GroupThirdHead = HeadCreator.create("James","J","J",MALE,"U10");
        Head GroupFourthHead = HeadCreator.create("Kaia","K","K",FEMALE,"U11");
        Head GroupFifthHead = HeadCreator.create("Lincoln","L","L",MALE,"U12");
        Head GroupSixthHead = HeadCreator.create("Maya","M","M",FEMALE,"U13");
        Head GroupSeventhHead = HeadCreator.create("Nathan","N","N",MALE,"U14");
        Head GroupEighthHead = HeadCreator.create("Octavia","O","O",FEMALE,"U15");
        Student StudentFirst = StudentCreator.create("John", "Doe", "Middle", MALE, "S001");
        Student StudentSecond = StudentCreator.create("Alice", "Smith", "Anne", FEMALE, "S002");
        Student StudentThird = StudentCreator.create("Michael", "Johnson", "Lee", MALE, "S003");
        Student StudentFourth = StudentCreator.create("Emma", "Brown", "Louise", FEMALE, "S004");
        Student StudentFifth = StudentCreator.create("James", "Williams", "David", MALE, "S005");
        Student StudentSixth = StudentCreator.create("Olivia", "Jones", "Grace", FEMALE, "S006");
        Student StudentSeventh = StudentCreator.create("William", "Taylor", "Edward", MALE, "S007");
        Student StudentEighth = StudentCreator.create("Sophia", "Anderson", "Rose", FEMALE, "S008");
        Student StudentNinth = StudentCreator.create("Alexander", "Jackson", "Michael", MALE, "S009");
        Student StudentTenth = StudentCreator.create("Mia", "Thomas", "Elizabeth", FEMALE, "S010");
        Student StudentEleventh = StudentCreator.create("Ethan", "Harris", "Benjamin", MALE, "S011");
        Student StudentTwelfth = StudentCreator.create("Ava", "White", "Nicole", FEMALE, "S012");
        Student StudentThirteenth = StudentCreator.create("Liam", "Martinez", "Jose", MALE, "S013");
        Student StudentFourteenth = StudentCreator.create("Isabella", "Garcia", "Maria", FEMALE, "S014");
        Student StudentFifteenth = StudentCreator.create("Noah", "Rodriguez", "Daniel", MALE, "S015");
        Student StudentSixteenth = StudentCreator.create("Charlotte", "Lopez", "Samantha", FEMALE, "S016");

        University UniversityTypical = new UniversityCreator().create("DP NTU UA",UniversityHead,
                FacultyCreator.create("Math",FacultyFirstHead,
                        DepartmentCreator.create("Math-fis",DepartmentFirstHead ,
                                GroupCreator.create("51",GroupFirstHead,StudentFirst,StudentSecond),
                                GroupCreator.create("52",GroupSecondHead,StudentThird,StudentFourth)),
                        DepartmentCreator.create("Math-bio",DepartmentSecondHead,
                                GroupCreator.create("53",GroupThirdHead,StudentFifth,StudentSixth),
                                GroupCreator.create("54",GroupFourthHead,StudentSeventh,StudentEighth))
                ),
                FacultyCreator.create("IT",FacultySecondHead,
                        DepartmentCreator.create("IT-Soft",DepartmentThirdHead ,
                                GroupCreator.create("121",GroupFifthHead,StudentNinth,StudentTenth),
                                GroupCreator.create("122",GroupSixthHead,StudentEleventh,StudentTwelfth)),
                        DepartmentCreator.create("IT-Engineering",DepartmentFourthHead,
                                GroupCreator.create("123",GroupSeventhHead,StudentThirteenth,StudentFourteenth),
                                GroupCreator.create("124",GroupEighthHead,StudentFifteenth,StudentSixteenth))
                )
        );
        return UniversityTypical;
    }

}
