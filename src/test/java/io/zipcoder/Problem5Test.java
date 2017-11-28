package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem5Test {

    @Test
    public void reverseStringTest(){
        String input = "I love UNIT Testing";
        Problem5 test = new Problem5();

        String expected = "gnitseT TINU evol I";

        String actual = test.reverseString(input);
        //only testing the reverse, no capitalization

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void capitalizeFirstCharTest(){
        Problem5 test = new Problem5();
        String input = test.reverseString("I love UNIT Testing");

        String expected = "Gnitset TINU Evol I";

        String actual = test.captializeFirstChar(input);

        Assert.assertEquals(expected,actual);
    }
}
