package com.basicCorePrograms;
import java.util.Scanner;
public class VowelOrConsonant {
    void alphabet(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Alphabet: ");
        char ch = scanner.next().charAt(0);
        if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ||
                ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println(ch + "" + " is a vowel");
        }else{
            System.out.println(ch + "  is a consonant");
        }
    }
    public static void main(String[] args) {
      VowelOrConsonant vowelOrConsonant = new VowelOrConsonant();
      vowelOrConsonant.alphabet();
    }
}
