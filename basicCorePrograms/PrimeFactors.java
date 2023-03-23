package com.basicCorePrograms;
import java.util.Scanner;
public class PrimeFactors {
    void factors(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ::");
        int number = scanner.nextInt();
        for(int i = 2; i< number; i++) {
            while(number%i == 0) {
                System.out.println(i+" ");
                number = number/i;
            }
        }
        if(number >2) {
            System.out.println(number);
        }
    }
    public static void main(String[] args) {
       PrimeFactors primeFactors = new PrimeFactors();
       primeFactors.factors();
    }
}
