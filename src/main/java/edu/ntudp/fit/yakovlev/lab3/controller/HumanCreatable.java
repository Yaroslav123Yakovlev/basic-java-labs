package edu.ntudp.fit.yakovlev.lab3.controller;
import edu.ntudp.fit.yakovlev.lab3.model.Human;
import edu.ntudp.fit.yakovlev.lab3.model.Sex;

public interface HumanCreatable<T extends Human> {
    T create(String firstName, String lastName, String middleName, Sex sex, String id);
}
