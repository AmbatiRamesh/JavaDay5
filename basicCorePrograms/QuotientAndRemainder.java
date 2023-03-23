package com.basicCorePrograms;
import java.util.Scanner;
public class QuotientAndRemainder {
    void quotientAndRemainder(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a First Number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter a Second Number: ");
        int number2 = scanner.nextInt();
        int quotient = number1/number2;
        int remainder = number1%number2;
        System.out.println("The quotient is: " + quotient);
        System.out.println("The remainder is: " + remainder);
    }
    public static void main(String[] args) {
        QuotientAndRemainder division = new QuotientAndRemainder();
        division.quotientAndRemainder();
    }
}
