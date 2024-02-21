package edu.ntudp.fit.yakovlev;
import java.util.Scanner;
import java.util.Random;

public class Lab2 {

    //Макс. розмір матриці
    private static final int MAX_SIZE = 20;
    //Діапазон випадкових чисел
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 10;

    public static void main(String[] args) {
        int[][] matrix;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Бажаєте ввести матрицю вручну (1) чи згенерувати випадково (2)? : ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            matrix = inputMatrix(scanner);
        } else if (choice == 2) {
            matrix = generateMatrix(scanner);
        } else {
            System.out.println("Невірний вибір.");
            return;
        }

        if (matrix != null) {
            System.out.println("Матриця:");
            printMatrix(matrix);
            findMinMax(matrix);
            calcArAver(matrix);
            calcGeoAver(matrix);
        } else {
            System.out.println("Неможливо створити матрицю.");
        }

        scanner.close();

    }

    //Введення матриці з клавіатури
    public static int[][] inputMatrix(Scanner scanner) {
        System.out.print("Введіть кількість рядків матриці: ");
        int rows = scanner.nextInt();
        System.out.print("Введіть кількість стовпців матриці: ");
        int cols = scanner.nextInt();

        if (rows <= 0 || rows > MAX_SIZE || cols <= 0 || cols > MAX_SIZE) {
            System.out.println("Незадовільні розміри матриці.");
            return null;
        }

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Введіть ["+i+"]["+j+"] елемент матриці: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    //Генерація матриці
    public static int[][] generateMatrix(Scanner scanner) {
        System.out.print("Введіть кількість рядків матриці: ");
        int rows = scanner.nextInt();

        System.out.print("Введіть кількість стовпців матриці: ");
        int cols = scanner.nextInt();

        if (rows <= 0 || rows > MAX_SIZE || cols <= 0 || cols > MAX_SIZE) {
            System.out.println("Незадовільні розміри матриці.");
            return null;
        }

        Random random = new Random();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE;
            }
        }

        return matrix;
    }

    //Виведення матриці
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem+ "\t");
            }
            System.out.println();
        }
    }

    //Пошук мін./макс. елемента матриці
    public static void findMinMax(int[][] matrix) {
        int min = matrix[0][0];
        int max = matrix[0][0];

        for (int[] row : matrix) {
            for (int elem : row) {
                if (elem < min) {
                    min = elem;
                }
                if (elem > max) {
                    max = elem;
                }
            }
        }

        System.out.println("Мінімальний елемент матриці: " + min);
        System.out.println("Максимальний елемент матриці: " + max);
    }

    //Пошук серед. арифм. матриці
    public static void calcArAver(int[][] matrix) {
        int sum = 0;
        int i = 0;

        for (int[] row : matrix) {
            for (int elem : row) {
                sum += elem;
                i++;
            }
        }

        double aver = (double) sum / i;
        System.out.println("Середнє арифметичне матриці: " + aver);
    }

    //Пошук серед. геометр. матриці
    public static void calcGeoAver(int[][] matrix) {
        long multi = 1;
        int rootNumb = 0;

        for (int[] row : matrix) {
            for (int elem : row) {
                multi *= elem;
                rootNumb++;
            }
        }

        double geoAver = Math.pow(multi, (double) 1 / rootNumb);
        System.out.println("Середнє геометричне матриці: " + geoAver);
    }

}
