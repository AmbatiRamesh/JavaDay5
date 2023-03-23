package com.functionalPrograms;

import java.util.Scanner;

public class Distance {
    void distance(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the value of X: ");
        int x = scanner.nextInt();
        System.out.println("Enter the value of Y");
        int y = scanner.nextInt();
        double dist = Math.sqrt(x*x + y*y);
        System.out.println("distance from (" + x + ", " + y + ") = " + dist);
    }
    public static void main(String[] args) {
       Distance point = new Distance();
       point.distance();
    }
}
