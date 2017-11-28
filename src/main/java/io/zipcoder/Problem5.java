package io.zipcoder;


import java.util.regex.Pattern;

public class Problem5 {

    public String reverseString(String string){
        String reverseStr="";
        for(int i=string.length()-1;i>=0;i--){
            reverseStr+=string.charAt(i);
        }
        return reverseStr;
    }
    public String capitalizeFirstL(String reverse){
        String[] split = reverse.split(" ");
        for(String each: split){
            each.charAt(0).toUpperCase();
        }

    }
}
