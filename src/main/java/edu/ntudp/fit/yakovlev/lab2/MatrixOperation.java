package edu.ntudp.fit.yakovlev.lab2;
import java.util.Scanner;
import java.util.Random;

public class MatrixOperation {

    private static final int MAX_SIZE_OF_MATRIX = 20;
    private static final int MIN_VALUE_OF_RANDOM_NUMBER = 1;
    private static final int MAX_VALUE_OF_RANDOM_NUMBER = 10;
    private static final String ROW_INPUT = "Enter number of matrix rows: ";
    private static final String COLUMNS_INPUT = "Enter number of matrix columns: ";

    public int[][] inputMatrixFromKeyboard(Scanner Scanner) {
        System.out.print(ROW_INPUT);
        int Rows = Scanner.nextInt();
        System.out.print(COLUMNS_INPUT);
        int Columns = Scanner.nextInt();

        if (Rows <= 0 || Rows > MAX_SIZE_OF_MATRIX || Columns <= 0 || Columns > MAX_SIZE_OF_MATRIX) {
            System.out.println("Unsatisfactory matrix dimensions.");
            return null;
        }

        int[][] Matrix = new int[Rows][Columns];

        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Columns; j++) {
                System.out.print("Enter ["+i+"]["+j+"] matrix element: ");
                Matrix[i][j] = Scanner.nextInt();
            }
        }

        return Matrix;
    }

    public int[][] generateMatrixFromRandomNumbers(Scanner Scanner) {
        System.out.print(ROW_INPUT);
        int Rows = Scanner.nextInt();
        System.out.print(COLUMNS_INPUT);
        int Columns = Scanner.nextInt();

        if (Rows <= 0 || Rows > MAX_SIZE_OF_MATRIX || Columns <= 0 || Columns > MAX_SIZE_OF_MATRIX) {
            System.out.println("Unsatisfactory matrix dimensions.");
            return null;
        }

        Random Random = new Random();
        int[][] Matrix = new int[Rows][Columns];

        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Columns; j++) {
                Matrix[i][j] = Random.nextInt(MAX_VALUE_OF_RANDOM_NUMBER - MIN_VALUE_OF_RANDOM_NUMBER + 1) + MIN_VALUE_OF_RANDOM_NUMBER;
            }
        }

        return Matrix;
    }

    public void printMatrixInConsole(int[][] Matrix) {
        for (int[] Row : Matrix) {
            for (int Element : Row) {
                System.out.print(Element+ "\t");
            }
            System.out.println();
        }
    }

    public void findMinMaxOfMatrix(int[][] Matrix) {
        int min = Matrix[0][0];
        int max = Matrix[0][0];

        for (int[] Row : Matrix) {
            for (int Element : Row) {
                if (Element < min) {
                    min = Element;
                }
                if (Element > max) {
                    max = Element;
                }
            }
        }

        System.out.println("Minimum matrix element: " + min);
        System.out.println("Maximum matrix element: " + max);
    }

    public void calculatingArithmeticMean(int[][] Matrix) {
        double sum = 0;
        int counter = 0;

        for (int[] Row : Matrix) {
            for (int Element : Row) {
                sum += Element;
                counter++;
            }
        }

        double arithmeticMean = sum / counter;
        System.out.println("Arithmetic mean of the matrix: " + arithmeticMean);
    }

    public void calculatingGeometricMean(int[][] Matrix) {
        double numbersProduct = 1;
        int rootNumber = 0;

        for (int[] Row : Matrix) {
            for (int Element : Row) {
                numbersProduct *= Element;
                rootNumber++;
            }
        }

        double geometricMean = Math.pow(numbersProduct, (double) 1 / rootNumber);
        System.out.println("Geometric mean of the matrix: " + geometricMean);
    }

}
