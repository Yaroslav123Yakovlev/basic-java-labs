package edu.ntudp.fit.yakovlev.controller;
import edu.ntudp.fit.yakovlev.model.Head;

public interface CompCreatableM<T,S> {
    T create(String name,Head head, S ... subComps);
}
