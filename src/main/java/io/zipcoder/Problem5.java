package io.zipcoder;

public class Problem5 {


    public String reverseString(String aString) {

        if (aString.length() == 1) {
            return aString;
        } else {

            return reverseString(aString.substring(1, aString.length())) + aString.charAt(0);
        }
    }


}
