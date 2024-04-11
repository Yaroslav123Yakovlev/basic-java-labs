package edu.ntudp.fit.yakovlev.lab2;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        int[][] matrix;
        Scanner scanner = new Scanner(System.in);
        MatrixOperation matrixOperations = new MatrixOperation();

        System.out.print("Would you like to enter the matrix manually (1) or generate it randomly (2)? : ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            matrix = matrixOperations.inputMatrixFromKeyboard(scanner);
        } else if (choice == 2) {
            matrix = matrixOperations.generateMatrixFromRandomNumbers(scanner);
        } else {
            System.out.println("Wrong choice.");
            return;
        }

        if (matrix != null) {
            System.out.println("Matrix:");
            matrixOperations.printMatrixInConsole(matrix);
            System.out.println("Minimum matrix element: " + matrixOperations.findMinOfMatrix(matrix));
            System.out.println("Maximum matrix element: " + matrixOperations.findMaxOfMatrix(matrix));
            System.out.println("Arithmetic mean of matrix: " + matrixOperations.calculateArithmeticMean(matrix));
            System.out.println("Geometric mean of matrix: " + matrixOperations.calculateGeometricMean(matrix));
        } else {
            System.out.println("Unable to create matrix.");
        }

        scanner.close();

    }

}
