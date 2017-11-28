package io.zipcoder;

import java.util.ArrayList;

public class Problem5 {

    String reverseString(String str){


        //hopefully the "i" in this loop doesn't count as a new variable
        //not sure if the .add and .charAt are okay since they don't have to do with reversing but are built in nonetheless

        for (int i = str.length(); i >=0; i --){
            ArrayList<Character> letters = new ArrayList<Character>();
            str += letters.add(str.charAt(i));
        }
            return str;
    }
}
