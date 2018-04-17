package io.zipcoder;

public class Problem5 {

    public String capitalizeWords(String sentence){

        //Capitalize first word of entire sentence
        sentence = Character.toUpperCase(sentence.charAt(0)) + sentence.substring(1);

        //Capitalizes each word by capitalizing the char one index after white space.
        for (int i = 1; i < sentence.length(); i++)
        {
            if(sentence.charAt(i) == ' ')
            {
                sentence = sentence.substring(0, i + 1) +
                           Character.toUpperCase(sentence.charAt(i + 1)) +
                           sentence.substring(i + 2);
            }
        }

        return sentence;
    }

    public String reverseSentence(String sentence){

        if (sentence.isEmpty()){
            return sentence;
        }

        return reverseSentence(sentence.substring(1)) + sentence.charAt(0);

    }

    public String capitalAndReverse(String sentence)
    {
        return capitalizeWords(reverseSentence(sentence));
    }









}


