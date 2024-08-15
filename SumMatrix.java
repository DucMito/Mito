import java.util.Scanner;

public class SumMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so row: ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so column: ");
        int column = Integer.parseInt(scanner.nextLine());
        if(row <= 0 && column <= 0) {
            System.out.println("Nhap row and column phai lon hon 0");
        } else if(row != column){
            System.out.println("Nhap row and column bang nhau");
        }else{
            System.out.println("Enter the matrix 1: ");
            int[][] matrixA = new int[row][column];
            for(int i = 0; i < row; i++) {
                for(int j =0; j<column; j++){
                    System.out.print("Nhap gia tri a[" + i + "][" +j+"]: "+ "\t");
                    matrixA[i][j] = scanner.nextInt();
                }
            }
            System.out.println("Enter the matrix 2:");
            int[][] matrixB = new int[row][column];
            for(int i = 0; i < row; i++) {
                for(int j =0; j<column; j++){
                    System.out.print("Nhap gia tri a[" + i + "][" +j+"]: "+ "\t");
                    matrixB[i][j] = scanner.nextInt();
                }
            }

            int[][] sumMatrix = new int[row][column];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
                }
            }
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    System.out.print(" " + sumMatrix[i][j]);
                }
                System.out.println();
            }
        }

    }
}
