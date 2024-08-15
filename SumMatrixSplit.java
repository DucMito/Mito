import java.util.Scanner;

public class SumMatrixSplit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Rows: ");
        int rows = Integer.parseInt(scanner.nextLine());
        System.out.print("Columns: ");
        int cols = Integer.parseInt(scanner.nextLine());
        scanner.nextLine();
        int[][] matrixA = inputMatrix(rows, cols, scanner, "Matrix A");
        int[][] matrixB = inputMatrix(rows, cols, scanner, "Matrix B");
        int[][] sumMatrix = addMatrices(matrixA, matrixB);
        displayMatrix(sumMatrix, "Sum of Matrix A and Matrix B");
    }
    public static int[][] inputMatrix(int rows, int cols, Scanner scanner, String matrixName) {
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter values for " + matrixName + ":");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrixName + "[" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] sumMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return sumMatrix;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix, String matrixName) {
        System.out.println(matrixName + ":");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

