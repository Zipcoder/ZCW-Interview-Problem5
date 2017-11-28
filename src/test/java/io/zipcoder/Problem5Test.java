package io.zipcoder;

import org.junit.Test;
import org.junit.Assert;

public class Problem5Test {

    Problem5 problem5 = new Problem5();

    @Test
    public void reverseTheString(){
        String expected = "gnitset TINU evol i";
        String actual = problem5.reverseTheString("i love UNIT testing");
        Assert.assertEquals(expected,actual);
    }
}
