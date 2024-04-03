package edu.ntudp.fit.yakovlev.lab4.controller;
import edu.ntudp.fit.yakovlev.lab4.model.Human;
import edu.ntudp.fit.yakovlev.lab4.model.Sex;

public interface HumanCreatable<T extends Human> {
    T create(String firstName, String lastName, String middleName, Sex sex, String id);
}
