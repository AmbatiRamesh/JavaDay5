package com.basicCorePrograms;

import java.util.Scanner;

public class SwapTwoNumbers {
    void swap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a First Number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter a Second Number: ");
        int number2 = scanner.nextInt();
        System.out.println("Before swapping the numbers:");
        System.out.println("First Number " + number1);
        System.out.println("Second Number " + number2);
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("After swapping the numbers:");
        System.out.println("First Number " + number1);
        System.out.println("Second Number " + number2);
    }
    public static void main(String[] args) {
        SwapTwoNumbers swapTwoNumbers = new SwapTwoNumbers();
        swapTwoNumbers.swap();
    }
}
