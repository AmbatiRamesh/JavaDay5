package com.basicCorePrograms;
import java.util.Scanner;
public class LeapYear {
    void year(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Year Number: ");
        int yearNumber = scanner.nextInt();
        if (yearNumber % 400 == 0) {
            System.out.println(yearNumber + " is a leap year.");
        } else if (yearNumber % 100 == 0) {
            System.out.println(yearNumber + " is not a leap year.");
        } else if (yearNumber % 4 == 0) {
            System.out.println(yearNumber + " is a leap year.");
        } else {
            System.out.println(yearNumber + " is not a leap year.");
        }
    }
    public static void main(String[] args) {
      LeapYear leapYear = new LeapYear();
      leapYear.year();
    }
}
