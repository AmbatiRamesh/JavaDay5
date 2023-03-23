package com.basicCorePrograms;
public class LargestAmongThreeNumbers {
    void largest(){
        int Array[] = {1, 2, 3, -3, -6, -5,};
        for (int i = 0; i < Array.length; i++) {
            for (int j = i + 1; j < Array.length; j++) {
                for (int k = j + 1; k < Array.length; k++) {
                    if (Array[i] + Array[j] + Array[k] == 0) {
                        System.out.println("Numbers found : " + Array[i] + "," + Array[j] + " and " + Array[k]);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        LargestAmongThreeNumbers largestAmongThreeNumbers = new LargestAmongThreeNumbers();
        largestAmongThreeNumbers.largest();
    }
}
