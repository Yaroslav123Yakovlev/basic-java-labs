package edu.ntudp.fit.yakovlev.lab4;

import edu.ntudp.fit.yakovlev.lab4.controller.UniversityCreator;
import edu.ntudp.fit.yakovlev.lab4.model.University;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonManagerTest {
    @Test
    void JsonManagerRunTest() {
        University oldUniversity = new UniversityCreator().createTypicalUniversity();
        JsonManager jsonManager = new JsonManager();
        jsonManager.writeToJson(oldUniversity,"json1");
        University newUniversity = jsonManager.readFromJson("json1");

        System.out.println(oldUniversity.equals(newUniversity));
        assertEquals(oldUniversity, newUniversity);
    }
}