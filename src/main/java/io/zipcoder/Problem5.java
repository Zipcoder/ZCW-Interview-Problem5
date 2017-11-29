package io.zipcoder;

public class Problem5 {

    public String reverseTheString(String input) {
        for (int i = input.length() - 1; i >= 0; i--) {
            input += input.charAt(i);
        }
        return input.substring(input.length()/2);
    }

//    public String reverseTheStringRecurse(String phrase) {
//        if (phrase.length() == 0) {
//            return "";
//        }
//        return phrase.charAt(phrase.length() - 1) + reverseTheString(phrase.substring(0, phrase.length() - 1));
//    }
}
