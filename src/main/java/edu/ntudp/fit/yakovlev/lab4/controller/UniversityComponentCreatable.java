package edu.ntudp.fit.yakovlev.lab4.controller;

import edu.ntudp.fit.yakovlev.lab4.model.Head;

import java.util.List;

public interface UniversityComponentCreatable<T,S> {
    T create(String name, Head head, List<S> subComponentOfUniversity);
    T create(String name,Head head, S ... subComponentsOfUniversity);
}

