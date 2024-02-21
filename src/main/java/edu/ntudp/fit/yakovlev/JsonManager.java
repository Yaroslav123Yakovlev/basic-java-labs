package edu.ntudp.fit.yakovlev;

import com.google.gson.Gson;
import edu.ntudp.fit.yakovlev.model.University;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonManager {


    public static void writeToJson(University university, String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            Gson gson = new Gson();
            gson.toJson(university, fileWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static University readFromJson(String fileName) {
        try (FileReader fileReader = new FileReader(fileName)) {
            Gson gson = new Gson();
            return gson.fromJson(fileReader, University.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}