package edu.ntudp.fit.yakovlev.lab3.controller;

import edu.ntudp.fit.yakovlev.lab3.model.Head;
import edu.ntudp.fit.yakovlev.lab3.model.Sex;


public class HeadCreator implements HumanCreatable<Head> {
    @Override
    public Head create(String firstName, String lastName, String middleName, Sex sex, String id) {
        return new Head(firstName, lastName, middleName, sex, id);
    }
}
