package com.basicCorePrograms;
import java.util.Scanner;
public class HeadsAndTails {
    void flipCoin(){
        System.out.println("Enter the number of flips");
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        int numOfFlips = n;
        int i,countHeads,countTails ;
        i = countHeads =countTails = 0;
        while(i < numOfFlips ) {
            byte randomNum = (byte)(Math.random() * 2);
            System.out.println(randomNum);
            int count = randomNum==1 ? countHeads++ : countTails++ ;
            i++;
        }
        System.out.println("number of heads "+countHeads);
        System.out.println("number of heads percentage  "+countHeads/(double)numOfFlips*100 +"%");
        System.out.println("number of tails "+countTails);
        System.out.println("number of heads percentage  "+countTails/(double)numOfFlips*100 +"%");
    }
    public static void main(String[] args) {
        HeadsAndTails headsAndTails = new HeadsAndTails();
        headsAndTails.flipCoin();
    }
}
