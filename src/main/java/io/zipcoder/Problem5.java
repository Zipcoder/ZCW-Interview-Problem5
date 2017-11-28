package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Problem5 {

    //Don't work

    public String reverseAndCapitalizeString(String input){


        for(int i = input.length()-1; i >=0 ; i--){
            input += input.charAt(i);
        }
        input = input.substring(input.length()/2);

        input = Arrays.toString(
                Arrays.stream(input.split(" "))
                        .map(word -> word.substring(0,1).toUpperCase()+word.substring(1,word.length()))
                        .map(word -> word + " ").
                        collect(Collectors.toList()).toArray());

        input = input.substring(1, input.length()-2);
        input = input.replaceAll(" ,", "");

        return input;
    }

}
