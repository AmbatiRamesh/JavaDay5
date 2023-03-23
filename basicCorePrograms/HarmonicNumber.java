package com.basicCorePrograms;
import java.util.Scanner;
public class HarmonicNumber {
    void harmonic(){
        double number,i;
        double sum=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        number=scanner.nextDouble();
        for( i=1;i<=number;i++){
            sum=sum+(1/i);
        }
        System.out.println("Harmonic value = "+sum);
    }
    public static void main(String[] args) {
       HarmonicNumber harmonicNumber = new HarmonicNumber();
       harmonicNumber.harmonic();
    }
}
