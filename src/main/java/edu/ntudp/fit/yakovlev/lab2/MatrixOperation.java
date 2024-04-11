package edu.ntudp.fit.yakovlev.lab2;
import java.util.Scanner;
import java.util.Random;

public class MatrixOperation {

    private static final int MAX_SIZE_OF_MATRIX = 20;
    private static final int MIN_VALUE_OF_RANDOM_NUMBER = 1;
    private static final int MAX_VALUE_OF_RANDOM_NUMBER = 10;
    private static final String ROW_INPUT_TEXT = "Enter number of matrix rows: ";
    private static final String COLUMNS_INPUT_TEXT = "Enter number of matrix columns: ";

    public int[][] inputMatrixFromKeyboard(Scanner scanner) {

        int[][] matrix = inputMatrixSize(scanner);

        if (matrix != null){
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print("Enter [" + i + "][" + j + "] matrix element: ");
                    matrix[i][j] = scanner.nextInt();
                }
            }
            return matrix;
        }
        else{
            return null;
        }

    }

    public int[][] generateMatrixFromRandomNumbers(Scanner scanner) {
        Random random = new Random();
        int[][] matrix = inputMatrixSize(scanner);

        if (matrix != null){
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = random.nextInt(MAX_VALUE_OF_RANDOM_NUMBER - MIN_VALUE_OF_RANDOM_NUMBER + 1) + MIN_VALUE_OF_RANDOM_NUMBER;
                }
            }
            return matrix;
        }
        else {
            return null;
        }
    }

    public void printMatrixInConsole(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element+ "\t");
            }
            System.out.println();
        }
    }

    public int findMinOfMatrix(int[][] matrix) {
        int min = matrix[0][0];

        for (int[] row : matrix) {
            for (int element : row) {
                if (element < min) {
                    min = element;
                }
            }
        }
        return min;
    }

    public int findMaxOfMatrix(int[][] matrix) {
        int max = matrix[0][0];

        for (int[] row : matrix) {
            for (int element : row) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }

    public double calculateArithmeticMean(int[][] matrix) {
        double sum = 0;
        int counter = 0;

        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
                counter++;
            }
        }

        return sum / counter;
    }

    public double calculateGeometricMean(int[][] matrix) {
        double numbersProduct = 1;
        int rootNumber = 0;

        for (int[] row : matrix) {
            for (int element : row) {
                numbersProduct *= element;
                rootNumber++;
            }
        }

        return Math.pow(numbersProduct, (double) 1 / rootNumber);
    }

    private int[][] inputMatrixSize (Scanner scanner){
        System.out.print(ROW_INPUT_TEXT);
        int rows = scanner.nextInt();
        System.out.print(COLUMNS_INPUT_TEXT);
        int columns = scanner.nextInt();

        if (rows <= 0 || rows > MAX_SIZE_OF_MATRIX || columns <= 0 || columns > MAX_SIZE_OF_MATRIX) {
            System.out.println("Unsatisfactory matrix dimensions.");
            return null;
        }

        return new int[rows][columns];
    }

}
