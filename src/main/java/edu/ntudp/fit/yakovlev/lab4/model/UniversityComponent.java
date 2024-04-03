package edu.ntudp.fit.yakovlev.lab4.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class UniversityComponent<T> {
    private String name;
    private List<T> SubComponentOfUniversity;
    private Head head;

    public UniversityComponent(String name, List<T> SubComponentOfUniversity, Head head) {
        this.name = name;
        this.SubComponentOfUniversity = SubComponentOfUniversity;
        this.head = head;
    }
    public UniversityComponent(String name, T SubComponentOfUniversity, Head head) {
        this.name = name;
        this.SubComponentOfUniversity = new ArrayList<>();
        this.SubComponentOfUniversity.add(SubComponentOfUniversity);
        this.head = head;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<T> getSubComponent() {
        return SubComponentOfUniversity;
    }
    public void setSubComponent(List<T> SubComponentOfUniversity) {
        this.SubComponentOfUniversity = SubComponentOfUniversity;
    }
    public void addSubComponent(T SubComponentOfUniversity) {
        this.SubComponentOfUniversity.add(SubComponentOfUniversity);
    }
    public void deleteSubComponent(T subComp) {
        this.SubComponentOfUniversity.remove(subComp);
    }
    public Head getHead() {
        return head;
    }
    public void setHead(Head head) {
        this.head = head;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UniversityComponent<?> that)) return false;
        return Objects.equals(name, that.name) && Objects.equals(SubComponentOfUniversity, that.SubComponentOfUniversity) && Objects.equals(head, that.head);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, SubComponentOfUniversity, head);
    }
}
