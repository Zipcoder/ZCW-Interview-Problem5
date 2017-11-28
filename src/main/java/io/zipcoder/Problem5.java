package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Problem5 {

    //Don't work

    public String reverseAndCapitalizeString(String input){
        //step1 reverse the string
        input = " "+input+" "; //add padding
        for(int i = 0; i < input.length()/2; i++){
            input = input.substring(0,i) + //padding + up to char to replace
                    input.substring(i, input.length() -1 -i) + //char from end half
                    input.substring(i+1, ) //middle
            //char from beginning half
            //end with padding
        }
        input = input.substring(1, input.length() - 1); //remove padding
        //step2 capitalize every first letter in a word
        input = Arrays.toString(Arrays.stream(input.split(" ")).
                map(word -> word.replace(word.charAt(0), Character.toUpperCase((word.charAt(0))))).
                map(word -> word + " ").
                collect(Collectors.toList()).toArray());

        return input;
    }

}
