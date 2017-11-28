package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem5Test {
    Problem5 problem5 = new Problem5();
    @Test
    public void testReverseString(){
        String string = "I love UNIT Testing";
        String expected ="Gnitest TINU Eovl I";
        String actual = problem5.reverseString(string);
        Assert.assertEquals(expected,actual);
    }
}
