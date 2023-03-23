package com.basicCorePrograms;
import java.util.Scanner;
public class PowerOfTwo {
    void power() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a number:");
        int number = scanner.nextInt();
        System.out.println("Power of 2^" + number + " is: " + (Math.pow(2, number)));
        System.out.println();
        System.out.println("Printing all till Power Value " + number);
        for (int i = 1; i <= number; i++) {
            System.out.println("Power of 2^" + i + " is: " + (Math.pow(2, i)));
        }
    }
    public static void main(String[] args) {
      PowerOfTwo powerOfTwo = new PowerOfTwo();
      powerOfTwo.power();
    }
}
