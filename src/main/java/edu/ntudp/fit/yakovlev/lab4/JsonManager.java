package edu.ntudp.fit.yakovlev.lab4;

import com.google.gson.Gson;
import edu.ntudp.fit.yakovlev.lab4.model.University;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonManager {


    public void writeToJson(University university, String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            Gson gson = new Gson();
            gson.toJson(university, fileWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public University readFromJson(String fileName) {
        try (FileReader fileReader = new FileReader(fileName)) {
            Gson gson = new Gson();
            return gson.fromJson(fileReader, University.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}