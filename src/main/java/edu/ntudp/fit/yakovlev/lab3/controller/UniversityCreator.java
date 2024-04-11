package edu.ntudp.fit.yakovlev.lab3.controller;

import edu.ntudp.fit.yakovlev.lab3.model.Faculty;
import edu.ntudp.fit.yakovlev.lab3.model.Head;
import edu.ntudp.fit.yakovlev.lab3.model.Student;
import edu.ntudp.fit.yakovlev.lab3.model.University;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static edu.ntudp.fit.yakovlev.lab3.model.Sex.FEMALE;
import static edu.ntudp.fit.yakovlev.lab3.model.Sex.MALE;

public class UniversityCreator implements UniversityComponentCreatable<University, Faculty>{

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
        HeadCreator headCreator = new HeadCreator();
        StudentCreator studentCreator = new StudentCreator();
        GroupCreator groupCreator = new GroupCreator();
        DepartmentCreator departmentCreator = new DepartmentCreator();
        FacultyCreator facultyCreator = new FacultyCreator();

        Head universityHead = headCreator.create("Anne","A","A",FEMALE,"U1");
        Head facultyFirstHead = headCreator.create("Bob","B","B",MALE,"U2");
        Head facultySecondHead = headCreator.create("Camila","C","C",FEMALE,"U3");
        Head departmentFirstHead = headCreator.create("David","D","D",MALE,"U4");
        Head departmentSecondHead = headCreator.create("Ella","E","E",FEMALE,"U5");
        Head departmentThirdHead = headCreator.create("Fred","F","F",MALE,"U6");
        Head departmentFourthHead = headCreator.create("Gabriella","G","G",FEMALE,"U7");
        Head groupFirstHead = headCreator.create("Harry","H","H",MALE,"U8");
        Head groupSecondHead = headCreator.create("Isla","I","I",FEMALE,"U9");
        Head groupThirdHead = headCreator.create("James","J","J",MALE,"U10");
        Head groupFourthHead = headCreator.create("Kaia","K","K",FEMALE,"U11");
        Head groupFifthHead = headCreator.create("Lincoln","L","L",MALE,"U12");
        Head groupSixthHead = headCreator.create("Maya","M","M",FEMALE,"U13");
        Head groupSeventhHead = headCreator.create("Nathan","N","N",MALE,"U14");
        Head groupEighthHead = headCreator.create("Octavia","O","O",FEMALE,"U15");
        Student studentFirst = studentCreator.create("John", "Doe", "Middle", MALE, "S001");
        Student studentSecond = studentCreator.create("Alice", "Smith", "Anne", FEMALE, "S002");
        Student studentThird = studentCreator.create("Michael", "Johnson", "Lee", MALE, "S003");
        Student studentFourth = studentCreator.create("Emma", "Brown", "Louise", FEMALE, "S004");
        Student studentFifth = studentCreator.create("James", "Williams", "David", MALE, "S005");
        Student studentSixth = studentCreator.create("Olivia", "Jones", "Grace", FEMALE, "S006");
        Student studentSeventh = studentCreator.create("William", "Taylor", "Edward", MALE, "S007");
        Student studentEighth = studentCreator.create("Sophia", "Anderson", "Rose", FEMALE, "S008");
        Student studentNinth = studentCreator.create("Alexander", "Jackson", "Michael", MALE, "S009");
        Student studentTenth = studentCreator.create("Mia", "Thomas", "Elizabeth", FEMALE, "S010");
        Student studentEleventh = studentCreator.create("Ethan", "Harris", "Benjamin", MALE, "S011");
        Student studentTwelfth = studentCreator.create("Ava", "White", "Nicole", FEMALE, "S012");
        Student studentThirteenth = studentCreator.create("Liam", "Martinez", "Jose", MALE, "S013");
        Student studentFourteenth = studentCreator.create("Isabella", "Garcia", "Maria", FEMALE, "S014");
        Student studentFifteenth = studentCreator.create("Noah", "Rodriguez", "Daniel", MALE, "S015");
        Student studentSixteenth = studentCreator.create("Charlotte", "Lopez", "Samantha", FEMALE, "S016");

        University universityTypical = new UniversityCreator().create("DP NTU UA",universityHead,
                facultyCreator.create("Math",facultyFirstHead,
                        departmentCreator.create("Math-fis",departmentFirstHead ,
                                groupCreator.create("51",groupFirstHead,studentFirst,studentSecond),
                                groupCreator.create("52",groupSecondHead,studentThird,studentFourth)),
                        departmentCreator.create("Math-bio",departmentSecondHead,
                                groupCreator.create("53",groupThirdHead,studentFifth,studentSixth),
                                groupCreator.create("54",groupFourthHead,studentSeventh,studentEighth))
                ),
                facultyCreator.create("IT",facultySecondHead,
                        departmentCreator.create("IT-Soft",departmentThirdHead ,
                                groupCreator.create("121",groupFifthHead,studentNinth,studentTenth),
                                groupCreator.create("122",groupSixthHead,studentEleventh,studentTwelfth)),
                        departmentCreator.create("IT-Engineering",departmentFourthHead,
                                groupCreator.create("123",groupSeventhHead,studentThirteenth,studentFourteenth),
                                groupCreator.create("124",groupEighthHead,studentFifteenth,studentSixteenth))
                )
        );
        return universityTypical;
    }

}
