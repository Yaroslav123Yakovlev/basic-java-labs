package edu.ntudp.fit.yakovlev.controller;

import edu.ntudp.fit.yakovlev.model.Head;

import java.util.List;

public interface CompCreatableL<T,S> {
    T create(String name, Head head, List<S> subComp);
}
