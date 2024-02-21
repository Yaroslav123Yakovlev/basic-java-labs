package edu.ntudp.fit.yakovlev.controller;

import edu.ntudp.fit.yakovlev.model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UniversityCreator implements CompCreatableL<University, Faculty>, CompCreatableM<University, Faculty>{

    @Override
    public University create(String name, Head head, List<Faculty> subComp) {
        if (subComp.isEmpty()){
            return null;
        }
        return new University(name, subComp, head);
    }

    @Override
    public University create(String name, Head head, Faculty... subComps) {
        if (subComps == null){
            return null;
        }
        List<Faculty> FacultyList = new ArrayList<>();
        Collections.addAll(FacultyList, subComps);
        return new University(name, FacultyList, head);
    }
}
