package edu.ntudp.fit.yakovlev;

import java.sql.*;


public class Lab5 {

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java-labs",
                "root",
                "dpntu2024")
        ){
            String selectQuery = "SELECT * FROM students";
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.printf("%-6s %-15s %-10s %-15s %-15s %-15s %-15s%n",
                    "Номер", "Прізвище", "Ім'я", "По батькові", "Дата народження", "ID-студента", "Залікова книжка"
            );


            while (resultSet.next()) {
                System.out.printf("%-6s %-15s %-10s %-15s %-15s %-15s %-15s%n",
                        resultSet.getInt("id"),
                        resultSet.getString("last_name"),
                        resultSet.getString("first_name"),
                        resultSet.getString("middle_name"),
                        resultSet.getDate("birth_date"),
                        resultSet.getString("student_id"),
                        resultSet.getString("gradebook_id")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
