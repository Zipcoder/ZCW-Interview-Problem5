package io.zipcoder;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class Problem5Test {

    Problem5 problem5;
    String input;

    @Before
    public void setup() {
        problem5 = new Problem5();
        input = "I Love UNIT Testing";
    }

    @Test
    public void reverseTheString(){
        String expected = "gnitseT TINU evoL I";
        String actual = problem5.reverseTheString(input);
        Assert.assertEquals(expected,actual);
    }
}
