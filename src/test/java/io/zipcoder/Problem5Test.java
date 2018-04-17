package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem5Test {

    @Test
    public void capitalizeWordsTest1() {
        //Given
        Problem5 problem5 = new Problem5();
        String sentence = "I love Zip Code Wilmington cirriculum the best";
        String expected = "I Love Zip Code Wilmington Cirriculum The Best";

        //When
        String actual = problem5.capitalizeWords(sentence);

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void capitalizeWordsTest2() {
        //Given
        Problem5 problem5 = new Problem5();
        String sentence = "I love UNIT Testing";
        String expected = "I Love UNIT Testing";

        //When
        String actual = problem5.capitalizeWords(sentence);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseSentence(){
        //Given
        Problem5 problem5 = new Problem5();
        String sentence = "I love UNIT Testing";
        String expected = "gnitseT TINU evol I";

        String actual = problem5.reverseSentence(sentence);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void captialAndReverseTest(){
        //Given
        Problem5 problem5 = new Problem5();
        String sentence = "I love UNIT Testing";
        String expected = "GnitseT TINU Evol I";

        String actual = problem5.capitalAndReverse(sentence);

        Assert.assertEquals(expected, actual);
    }



}