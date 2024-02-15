package edu.ntudp.fit.yakovlev.controller;

import edu.ntudp.fit.yakovlev.model.Head;
import edu.ntudp.fit.yakovlev.model.Sex;


public class HeadCreator implements HumanCreatable<Head> {
    @Override
    public Head create(String firstName, String lastName, String middleName, Sex sex, String id) {
        return new Head(firstName, lastName, middleName, sex, id);
    }
}
