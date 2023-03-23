package com.functionalPrograms;
import java.util.Scanner;
public class Two_D_Array {
    void array(){
        int row, col, i, j;
        int arr[][] = new int[10][10];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row for the array (max 10) : ");
        row = scanner.nextInt();
        System.out.print("Enter column for the array (max 10) : ");
        col = scanner.nextInt();
        System.out.println("Enter " + (row * col) + " Array Elements : ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.print("The Array is :\n");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       Two_D_Array twoDArray = new Two_D_Array();
       twoDArray.array();
    }
}
