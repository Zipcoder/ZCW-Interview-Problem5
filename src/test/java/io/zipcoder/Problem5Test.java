package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem5Test {

    @Test
    public void reverseStringTest(){
        String input = "I love UNIT Testing";
        Problem5 test = new Problem5();

        String expected = "Gnitset TINU Evol I";

        String actual = test.reverseString(input);

        Assert.assertEquals(expected,actual);
    }
}
