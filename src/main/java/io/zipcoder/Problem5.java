package io.zipcoder;


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
        String temp="";
        for(String each: split){
            temp+=each.substring(0,1).toUpperCase()+each.substring(1,each.length()).toLowerCase()+" ";
        }
        return temp.trim();
    }
}
