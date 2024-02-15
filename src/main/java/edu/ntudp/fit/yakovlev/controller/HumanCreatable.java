package edu.ntudp.fit.yakovlev.controller;
import edu.ntudp.fit.yakovlev.model.Human;
import edu.ntudp.fit.yakovlev.model.Sex;

public interface HumanCreatable<T extends Human> {
    T create(String firstName, String lastName, String middleName, Sex sex, String id);
}
