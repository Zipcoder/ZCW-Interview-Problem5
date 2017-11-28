package io.zipcoder;

public class Problem5 {

    public String reverseString(String inputString){

        if(inputString.length()== 0){
            return "";
        }

        return inputString.charAt(inputString.length()-1)+reverseString(inputString.substring(0,inputString.length()-1));
    }
    

}
