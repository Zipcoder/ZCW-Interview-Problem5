package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem5Test {

    @Test
    public void reverseStringTest (){

        Problem5 problem = new Problem5();

        String expected = "Gnitest TINU Eovl I";

        String actual = problem.reverseString("I love UNIT Testing");

        Assert.assertEquals(expected,actual);

    }

}
