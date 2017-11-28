package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem5Test {

    Problem5 prob5Test;
    @Before
    public void setUp() {
        prob5Test = new Problem5();
    }

    @Test
    public void reverseAStringTest() {
        String expected = "Gnitest TINU Eovl I";
        String actual = prob5Test.reserveAString("I love UNIT Testing");
        Assert.assertEquals(expected, actual);
    }
}
