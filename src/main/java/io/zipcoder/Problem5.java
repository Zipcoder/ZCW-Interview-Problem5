package io.zipcoder;

public class Problem5 {

    public String reverseThisWord(String text)
    {
        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--)
        {
            reversed += text.charAt(i);
        }

        return reversed.substring(0,1).toUpperCase() + reversed.substring(1, reversed.length());
    }

    public String reverseThisSentence(String sentence)
    {
        String reversedSentance = "";
        String [] words = sentence.split(" ");

        return null;
    }
}


