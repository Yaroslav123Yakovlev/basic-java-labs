package edu.ntudp.fit.yakovlev.lab3.model;

import java.util.Objects;

public class Head extends Human {
    private String headId;

    public Head(String firstName, String lastName, String middleName, Sex sex, String headId) {
        super(firstName, lastName, middleName, sex);
        this.headId = headId;
    }
    public String getHeadId() {
        return headId;
    }
    public void setHeadId(String headId) {
        this.headId = headId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Head head)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(headId, head.headId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), headId);
    }
}
