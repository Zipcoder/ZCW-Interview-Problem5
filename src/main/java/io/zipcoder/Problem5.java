package io.zipcoder;

import clover.org.apache.commons.lang.WordUtils;

public class Problem5 {

    public String reverseStringNormal(String input) {
        String reversed = "";

        for (int i = input.length()-1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed.substring(0,1).toUpperCase() + reversed.substring(1, reversed.length());
    }

    public String reverseWithRecursion(String input){
        if (input.length() <=1){
            return input;
        }
        return reverseWithRecursion(input.substring(1)) + input.charAt(0);
    }

    public String capitalizeFirstWord(String input){
        input = Character.toUpperCase(input.charAt(0)) + input.substring(1);
        for(int i = 0; i < input.length(); i++){
            if (input.charAt(i) == 32){
                input = input.substring(0, i+1) + Character.toUpperCase(input.charAt(i+1)) + input.substring(i+2);
            }
        }
        return input;
    }

    public String capitalizedAndReversed(String input){
        return capitalizeFirstWord(reverseWithRecursion(input));
    }

    public String capitalizeWithWordUtils(String string){
        return WordUtils.capitalize(reverseWithRecursion(string));
    }


}
