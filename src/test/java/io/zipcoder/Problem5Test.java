package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem5Test {

    @Test
    public void reverseTest(){
        Problem5 test = new Problem5();
        String input = "I love UNIT Testing";
        String expected = "GnitseT TINU evol I";
        String actual = test.reverseStringNormal(input);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void reverseRecursionTest(){
        Problem5 test = new Problem5();
        String input = "I love UNIT Testing";
        String expected = "GnitseT TINU evol I";
        String actual = test.reverseWithRecursion(input);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void reverseAndCapTest(){
        Problem5 test = new Problem5();
        String input = "I love UNIT Testing";
        String expected = "GnitseT TINU Evol I";
        String actual = test.capitalizedAndReversed(input);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void wordUtilsTest(){
        Problem5 test = new Problem5();
        String input = "I love UNIT Testing";
        String expected = "GnitseT TINU Evol I";
        String actual = test.capitalizeWithWordUtils(input);

        Assert.assertEquals(expected, actual);
    }
}
