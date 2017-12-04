package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem5Test {
    Problem5 problem5 = new Problem5();
    @Test
    public void testReverseString(){
        String string = "I love UNIT Testing";
        String expected ="Gnitset Tinu Evol I";
        String reverse=problem5.reverseString(string);
        String actual=problem5.capitalizeFirstL(reverse);
        Assert.assertEquals(expected,actual);
    }
}
