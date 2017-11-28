package io.zipcoder;

public class Problem5 {

    public String reverseStringAndCapitalizeFirstLetter(String string){
        for (int i = string.length()-1; i >= 0; i--){
            string = string + string.charAt(i);
        }
        string = string.substring(string.length()/2);
        return string;
    }

}
//reverses the String, but does not capitalize letters
//no new variables????
//no google
