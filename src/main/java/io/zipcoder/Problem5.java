package io.zipcoder;

public class Problem5 {

    public String reverseTheString(String[] arr){
        String output = "I love UNIT Testing";
        for (int i = arr.length - 1; i >= 0; i--) {
            output += String.format("\n" + arr[i]);
        }
        return output;
    }
}
//is output a new variable?? is that what the lab means? if so, i did this wrong.