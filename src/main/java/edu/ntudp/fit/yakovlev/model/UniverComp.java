package edu.ntudp.fit.yakovlev.model;

import java.util.ArrayList;
import java.util.List;

public abstract class UniverComp <T> {
    private String name;
    private List<T> subComp;
    private Head head;

    public UniverComp(String name, List<T> subComp, Head head) {
        this.name = name;
        this.subComp = subComp;
        this.head = head;
    }
    public UniverComp(String name, T subComp, Head head) {
        this.name = name;
        this.subComp = new ArrayList<>();
        this.subComp.add(subComp);
        this.head = head;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<T> getSubComp() {
        return subComp;
    }
    public void setSubComp(List<T> subComp) {
        this.subComp = subComp;
    }
    public void addSubComp(T subComp) {
        this.subComp.add(subComp);
    }
    public void deleteSubComp(T subComp) {
        this.subComp.remove(subComp);
    }
    public Head getHead() {
        return head;
    }
    public void setHead(Head head) {
        this.head = head;
    }
}
