package edu.ntudp.fit.yakovlev;

import edu.ntudp.fit.yakovlev.controller.GroupCreator;
import edu.ntudp.fit.yakovlev.controller.StudentCreator;
import edu.ntudp.fit.yakovlev.model.Group;
import edu.ntudp.fit.yakovlev.model.Sex;

public class Lab3 {
    public static void main(String[] args) {
        Group group1 = new GroupCreator().create("123-20-1", null//new HeadCreator().create("A","A","B", Sex.MALE, "1")
                ,new StudentCreator().create("Yaroslav","Yakovlev","Yuriyovich", Sex.MALE, "1"),
                new StudentCreator().create("A","A","A", Sex.FEMALE, "2"),
                new StudentCreator().create("B","B","B", Sex.MALE, "3"));
        System.out.println(group1.getHead());
    }

}
