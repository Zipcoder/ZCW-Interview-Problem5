package io.zipcoder;

import java.util.ArrayList;

public class Problem5 {

    String reverseString(String str){



        for (int i = str.length(); i >=0; i --){
            ArrayList<Character> letters = new ArrayList<Character>();
            str += letters.add(str.charAt(i));
        }
            return str;
    }
}
