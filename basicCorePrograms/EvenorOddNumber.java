package com.basicCorePrograms;
import java.util.Scanner;
public class EvenorOddNumber {
    void evenOrOdd(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number = scanner.nextInt();
        if(number%2 == 0){
            System.out.println(number + " is Even ");
        }
        else{
            System.out.println(number + " is Odd ");
        }
    }
    public static void main(String[] args) {
        EvenorOddNumber evenorOddNumber = new EvenorOddNumber();
        evenorOddNumber.evenOrOdd();
    }
}
