package io.zipcoder;

public class Problem5 {

    public String reverseString(String inputString) {

        if (inputString.equals("")) {
            return inputString;
        }
        
        //string length gets 1 smaller every time method is called

        return inputString.charAt(inputString.length() - 1) + reverseString(inputString.substring(0, inputString.length() - 1));
    }

    public String allLowerCase(String inputString){
        return inputString.toLowerCase();
    }

    public String captializeFirstChar(String inputString){
        return Character.toUpperCase(inputString.charAt(0)) + allLowerCase(inputString.substring(1,inputString.length()));
    }

}
