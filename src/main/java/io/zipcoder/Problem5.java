package io.zipcoder;

public class Problem5 {
    public static void main(String[] args) {

        Problem5 problem5 = new Problem5();
        problem5.reverseString("raul cubila");

    }

    public void reverseString(String str){
        String  result = "";
        String holder = "";

            for(int i = str.length() - 1; i >= 0; i--){

                holder += str.charAt(i);
        }
        System.out.println(holder);
    }
}
