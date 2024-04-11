package edu.ntudp.fit.yakovlev.lab5;

import java.util.Scanner;
import java.sql.*;


public class Run {
    private static final String URL_SQL_JDBC_CONNECTION = "jdbc:mysql://localhost:3306/java_labs";
    private static final String USER_SQL_JDBC_CONNECTION = "root";
    private static final String PASSWORD_SQL_JDBC_CONNECTION = "dpntu2024";
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(
                URL_SQL_JDBC_CONNECTION,
                USER_SQL_JDBC_CONNECTION,
                PASSWORD_SQL_JDBC_CONNECTION
                )
        ){
            Scanner scanner = new Scanner(System.in);
            SQLManager sqlManager = new SQLManager();

            String readyQuery = sqlManager.selectQuery(scanner);
            if (readyQuery == null) { return; }
            sqlManager.printResultSet(connection,readyQuery);

            scanner.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
