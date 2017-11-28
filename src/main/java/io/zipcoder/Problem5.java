package io.zipcoder;

//My assumption is that we're not to use any inbuilt
//function to reverse the String, but that other methods are fine.

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
        //for (int i=0; i<input.length(); i++)
        return "";
    }

    public String finalOutput(String input){

        return "";
    }

}
