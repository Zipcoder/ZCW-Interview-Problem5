package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem5Test {

    @Test
    public void reverseTest(){
        Problem5 problem5 = new Problem5();
        String input = "I love UNIT Testing";

        String actual = problem5.reverseAndCapitalizeString(input);

        String expected = "GnitseT TINU Evol I";

        Assert.assertEquals(expected, actual);
    }

}
