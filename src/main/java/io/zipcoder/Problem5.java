package io.zipcoder;

//My assumption is that we're not to use any inbuilt
//function to reverse the String, but that other methods are fine.
//
//Another assumption is that the expected output on the lab is incorrect.
//Instead of:
//  Input : I love UNIT Testing
//  Output: Gnitest TINU Eovl I
//Output should be:
//  Output: GnitseT TINU Evol I
//
//Once these clarifications are in place, the
//solution becomes possible in a 30 minute timeframe.

public class Problem5 {

//Reverse the String without creating new variables...
    public String reverseString(String input){

        return reverseStringBuilder(input, input.length()-1);
    }

    private String reverseStringBuilder(String input, int index){
        if (index==0){
            return ""+input.charAt(0);
        }

        return (input.charAt(index)+reverseStringBuilder(input, index-1));
    }


//Capitalize the LAST letter of each word.
// It will become the first letter when reversed.
    public String capitalizeLast(String input){
        for (int i=0; i<input.length(); i++){
            if (i==input.length()-1){
                //capitalize the last letter
                input=input.substring(0,i)+input.substring(i).toUpperCase();
            }
            if (input.charAt(i)==' '){
                //capitalize charAt i-1
                input=input.substring(0,i-1)+input.substring(i-1,i).toUpperCase()+input.substring(i);
            }
        }
        return input;
    }

    public String finalOutput(String input){
        return reverseString(capitalizeLast(input));
    }

}
