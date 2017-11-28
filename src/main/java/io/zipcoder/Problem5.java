package io.zipcoder;

import java.util.ArrayList;

public class Problem5 {

    public String reserveAString(String input) {
        char[] inputToChar = new char[input.length()];
        ArrayList<Character> reversedString = new ArrayList<Character>();

        for (int i = inputToChar.length-1; i >= 0; i--) {
            reversedString.add(inputToChar[i]);
        }
        return reversedString.toString();
    }
}

//nope....
