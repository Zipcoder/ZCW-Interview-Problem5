package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem5Test {

    Problem5 problem5 = new Problem5();

    @Test
    public void reverseStringTest(){

        String expected = "gnitset TINU evol I";
        String actual = problem5.reverseString("I love UNIT testing");

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void capitalizeStringTest(){

        String expected = "I Love UNIT Testing";
        String actual = problem5.capitalizeString("i love UNIT testing");

        Assert.assertEquals(expected,actual);

    }


}
