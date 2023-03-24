package com.basicCorePrograms;

import java.util.Scanner;

public class LargestAmongThreeNumbers {
    void largest(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a First Number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter a Second Number: ");
        int number2 = scanner.nextInt();
        System.out.println("Enter a Third Number: ");
        int number3 = scanner.nextInt();
        if(number1 > number2 && number1 > number3){
            System.out.println(number1);
        } else if ( number2 > number1 && number2 > number3) {
            System.out.println(number2);

        }else{
            System.out.println(number3);
        }
    }
    public static void main(String[] args) {
        LargestAmongThreeNumbers largestAmongThreeNumbers = new LargestAmongThreeNumbers();
        largestAmongThreeNumbers.largest();
    }
}
