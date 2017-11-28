package io.zipcoder;

public class Problem5 {

    public String reverseTheString(String phrase) {
        if (phrase.length() == 0) {
            return "";
        }
        return phrase.charAt(phrase.length() - 1) + reverseTheString(phrase.substring(0, phrase.length() - 1));
    }
}
//better way to solve