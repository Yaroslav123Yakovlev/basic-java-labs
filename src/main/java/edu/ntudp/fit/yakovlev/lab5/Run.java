package edu.ntudp.fit.yakovlev.lab5;

import java.util.Scanner;
import java.sql.*;


public class Run {

    public static void main(String[] args) {
        try (Connection Connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java_labs",
                "root",
                "dpntu2024")
        ){
            Scanner Scanner = new Scanner(System.in);
            System.out.print("Enter the month (0 = print all; 1-12 = print by chosen month): ");
            int choice = Scanner.nextInt();
            String selectQuery ;

            if (choice == 0) {
                selectQuery = "SELECT * FROM students";
            } else if (choice >= 1 & choice <= 12) {
                selectQuery= "SELECT * FROM students WHERE MONTH(birth_date) =" + choice + " ;";
            } else {
                System.out.println("Wrong choice.");
                return;
            }

            PreparedStatement PreparedStatement = Connection.prepareStatement(selectQuery);
            ResultSet ResultSet = PreparedStatement.executeQuery();
            System.out.printf("%-6s %-15s %-10s %-15s %-15s %-15s %-15s%n",
                    "#", "Last name", "First name", "Middle name", "Birth date", "Student id", "Gradebook id"
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
