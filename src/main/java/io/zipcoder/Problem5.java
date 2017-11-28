package io.zipcoder;

public class Problem5 {

    public String reverseStringAndCapitalizeFirstLetter(String string){
        for (int i = string.length(); i >= 0; i--){
            string += i;
            System.out.print(string);//testing purposes
        }
        return string;

    }

    public String turnStringIntoArray(){

    }
}
//no built in functions
//no new variables????
//no google

//start at end of string and iterate backwards?...cant use .length()
//not even close