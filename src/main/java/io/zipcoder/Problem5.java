package io.zipcoder;

public class Problem5 {

    Problem5() {
    }

    public String reverseString(String input) {
        if (input.length() == 0) {
            return "";
        }
        return input.charAt(input.length() - 1) + reverseString(input.substring(0, input.length() - 1));

    }

    public String capitalizeString(String input) {
        
        return ;
    }


}
