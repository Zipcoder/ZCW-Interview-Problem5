package io.zipcoder;



public class Problem5 {

    public static String reverseString(){

        String input = "I love UNIT Testing";

        char[] reverseInput = input.toCharArray();

        for(int i = reverseInput.length-1; i>=0; i--)
            System.out.print(reverseInput[i]);
        return reverseString().toUpperCase();
    }


}
