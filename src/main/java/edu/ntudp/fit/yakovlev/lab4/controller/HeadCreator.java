package edu.ntudp.fit.yakovlev.lab4.controller;

import edu.ntudp.fit.yakovlev.lab4.model.Head;
import edu.ntudp.fit.yakovlev.lab4.model.Sex;


public class HeadCreator implements HumanCreatable<Head> {
    @Override
    public Head create(String firstName, String lastName, String middleName, Sex sex, String id) {
        return new Head(firstName, lastName, middleName, sex, id);
    }
}
