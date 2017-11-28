package io.zipcoder;

public class Problem5 {

    public String reverseString(String input) {
//        String stringToReturn = "";
//        for(int i = 0; i < input.length(); i++) {
//            stringToReturn = input.charAt(i) + stringToReturn;
//        }
//        return stringToReturn;
        return lastCharToBeginning(input, "");
    }

    private String lastCharToBeginning(String original, String current) {
        if(original.length() > 0) {
            return lastCharToBeginning(original.substring(1), original.substring(0, 1) + current);
        }
        else {
            return current;
        }
    }
}
