package edu.ntudp.fit.yakovlev.lab5;

import java.sql.*;


public class Run {

    public static void main(String[] args) {
        try (Connection Connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java_labs",
                "root",
                "dpntu2024")
        ){
            String selectQueryOne = "SELECT * FROM students";
            PreparedStatement PreparedStatement = Connection.prepareStatement(selectQueryOne);
            ResultSet ResultSet = PreparedStatement.executeQuery();
            System.out.printf("%-6s %-15s %-10s %-15s %-15s %-15s %-15s%n",
                    "Номер", "Прізвище", "Ім'я", "По батькові", "Дата народження", "ID-студента", "Залікова книжка"
            );

            while (ResultSet.next()) {
                System.out.printf("%-6s %-15s %-10s %-15s %-15s %-15s %-15s%n",
                        ResultSet.getInt("id"),
                        ResultSet.getString("last_name"),
                        ResultSet.getString("first_name"),
                        ResultSet.getString("middle_name"),
                        ResultSet.getDate("birth_date"),
                        ResultSet.getString("student_id"),
                        ResultSet.getString("gradebook_id")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
