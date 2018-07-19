package io.zipcoder;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Problem5 {

    public String reverseAndCapitalizeString(String input){

        for(int i = input.length()-1; i >=0 ; i--){
            input += input.charAt(i);
        }
        input = input.substring(input.length()/2);

        input = String.join( " ",
                Arrays.stream(input.split(" "))
                        .map(word -> word.substring(0,1).toUpperCase()+word.substring(1,word.length()))
                        .collect(Collectors.toList()));
        return input;
    }
}
