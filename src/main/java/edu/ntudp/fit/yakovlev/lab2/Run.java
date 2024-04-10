package edu.ntudp.fit.yakovlev.lab2;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        int[][] Matrix;
        Scanner Scanner = new Scanner(System.in);
        MatrixOperation MatrixOperations = new MatrixOperation();

        System.out.print("Would you like to enter the matrix manually (1) or generate it randomly (2)? : ");
        int Choice = Scanner.nextInt();

        if (Choice == 1) {
            Matrix = MatrixOperations.inputMatrixFromKeyboard(Scanner);
        } else if (Choice == 2) {
            Matrix = MatrixOperations.generateMatrixFromRandomNumbers(Scanner);
        } else {
            System.out.println("Wrong choice.");
            return;
        }

        if (Matrix != null) {
            System.out.println("Matrix:");
            MatrixOperations.printMatrixInConsole(Matrix);
            MatrixOperations.findMinMaxOfMatrix(Matrix);
            MatrixOperations.calculatingArithmeticMean(Matrix);
            MatrixOperations.calculatingGeometricMean(Matrix);
        } else {
            System.out.println("Unable to create matrix.");
        }

        Scanner.close();

    }

}
