package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem5Test {

    @Test
    public void reverseStringTest() {
        Problem5 problem5 = new Problem5();
        String input = "I love UNIT Testing";

        String expected = "GnitseT TINU Evol I";
        String actual = problem5.reverseString(input);

        Assert.assertEquals(expected, actual);
    }
}
