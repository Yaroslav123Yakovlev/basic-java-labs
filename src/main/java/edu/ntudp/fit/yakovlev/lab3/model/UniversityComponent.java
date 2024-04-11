package edu.ntudp.fit.yakovlev.lab3.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class UniversityComponent<T> {
    private String name;
    private List<T> subComponentOfUniversity;
    private Head head;

    public UniversityComponent(String name, List<T> subComponentOfUniversity, Head head) {
        this.name = name;
        this.subComponentOfUniversity = subComponentOfUniversity;
        this.head = head;
    }
    public UniversityComponent(String name, T subComponentOfUniversity, Head head) {
        this.name = name;
        this.subComponentOfUniversity = new ArrayList<>();
        this.subComponentOfUniversity.add(subComponentOfUniversity);
        this.head = head;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<T> getSubComponent() {
        return subComponentOfUniversity;
    }
    public void setSubComponent(List<T> subComponentOfUniversity) {
        this.subComponentOfUniversity = subComponentOfUniversity;
    }
    public void addSubComponent(T subComponentOfUniversity) {
        this.subComponentOfUniversity.add(subComponentOfUniversity);
    }
    public void deleteSubComponent(T subComponentOfUniversity) {
        this.subComponentOfUniversity.remove(subComponentOfUniversity);
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
        return Objects.equals(name, that.name) && Objects.equals(subComponentOfUniversity, that.subComponentOfUniversity) && Objects.equals(head, that.head);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subComponentOfUniversity, head);
    }
}
