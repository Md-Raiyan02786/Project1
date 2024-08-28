package ObjectPackage;
import java.util.Scanner;

public class Matrix{

    private int[][] matrix;
    private int rows, columns;

    // Constructor to initialize matrix
    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        matrix = new int[rows][columns];
    }

    // Method to read elements into the matrix
    public void readElements() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Private method to calculate the sum of all elements
    public int sumOfElements() {
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    // Private method to print the matrix in grid format
    public void printMatrix() {
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Private method to print the elements of the principal diagonal
    public void printPrincipalDiagonal() {
        System.out.println("Principal Diagonal Elements:");
        for (int i = 0; i < Math.min(rows, columns); i++) {
            System.out.print(matrix[i][i] + "\t");
        }
        System.out.println();
    }

    // Private method to calculate the sum of the principal diagonal elements
    public int sumPrincipalDiagonal() {
        int sum = 0;
        for (int i = 0; i < Math.min(rows, columns); i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    // Main method with menu-driven logic
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide the number of rows and columns as command-line arguments.");
            return;
        }

        int rows = Integer.parseInt(args[0]);
        int columns = Integer.parseInt(args[1]);

        Matrix matrixOps = new Matrix(rows, columns);
        matrixOps.readElements();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Sum of all elements");
            System.out.println("2. Print the matrix");
            System.out.println("3. Print the principal diagonal");
            System.out.println("4. Sum of elements in the principal diagonal");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Sum of all elements: " + matrixOps.sumOfElements());
                    break;
                case 2:
                    matrixOps.printMatrix();
                    break;
                case 3:
                    matrixOps.printPrincipalDiagonal();
                    break;
                case 4:
                    System.out.println("Sum of elements in the principal diagonal: " + matrixOps.sumPrincipalDiagonal());
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
