package io.zipcoder;

public class Problem5 {

    public String reverseString(String input){

        for(int i = 0; i < input.length(); i++){

            input.replace(input.subSequence(i, i),input.subSequence((input.length()-i)/2, (input.length()-i)/2));
        }

        return input;
    }
}
