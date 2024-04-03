package edu.ntudp.fit.yakovlev.lab2;
import java.util.Scanner;
import java.util.Random;

public class Lab2 {

    private static final int MAX_SIZE_OF_MATRIX = 20;
    private static final int MIN_VALUE_OF_RANDOM_NUMBER = 1;
    private static final int MAX_VALUE_OF_RANDOM_NUMBER = 10;
    private static final String ROW_INPUT = "Enter number of matrix rows: ";
    private static final String COLUMNS_INPUT = "Enter number of matrix columns: ";

    public int[][] InputMatrixFromKeyboard(Scanner Scanner) {
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

    public int[][] GenerateMatrixFromRandomNumbers(Scanner Scanner) {
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

    public void ConsolePrintMatrix(int[][] Matrix) {
        for (int[] Row : Matrix) {
            for (int Element : Row) {
                System.out.print(Element+ "\t");
            }
            System.out.println();
        }
    }

    public void FindMinimumMaximumOfMatrix(int[][] Matrix) {
        int Min = Matrix[0][0];
        int Max = Matrix[0][0];

        for (int[] Row : Matrix) {
            for (int Element : Row) {
                if (Element < Min) {
                    Min = Element;
                }
                if (Element > Max) {
                    Max = Element;
                }
            }
        }

        System.out.println("Minimum matrix element: " + Min);
        System.out.println("Maximum matrix element: " + Max);
    }

    public void CalculatingArithmeticMean(int[][] Matrix) {
        double Sum = 0;
        int Counter = 0;

        for (int[] Row : Matrix) {
            for (int Element : Row) {
                Sum += Element;
                Counter++;
            }
        }

        double ArithmeticMean = Sum / Counter;
        System.out.println("Arithmetic mean of the matrix: " + ArithmeticMean);
    }

    public void CalculatingGeometricMean(int[][] Matrix) {
        double NumbersProduct = 1;
        int RootNumber = 0;

        for (int[] Row : Matrix) {
            for (int Element : Row) {
                NumbersProduct *= Element;
                RootNumber++;
            }
        }

        double GeometricMean = Math.pow(NumbersProduct, (double) 1 / RootNumber);
        System.out.println("Geometric mean of the matrix: " + GeometricMean);
    }

}
