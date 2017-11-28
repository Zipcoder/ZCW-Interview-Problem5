package io.zipcoder;

public class Problem5 {

    public String reverseString(String inputString){

        inputString = String.valueOf(inputString.toCharArray());

        for (int i = inputString.length()-1;i >= 0; i--){
            inputString = inputString.toLowerCase();
            //inputString.replace(inputString.charAt(inputString.length()-1))
        }


//          created new variables,cant use
//
//        StringBuilder output = new StringBuilder();
//
//        char [] chars = inputString.toLowerCase().toCharArray();
//
//        for (int i = chars.length-1;i >= 0;i--){
//            output.append(chars[i]);
//        }
//
//        return output.toString();
        return inputString;
    }

}
