package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem5Test {

    Problem5 problem5;

    @Before
    public void setup() {
        problem5 = new Problem5();
    }

    @Test
    public void reverseAndCapitalize() throws Exception {

        String input = "I love UNIT Testing";

        String expected = "Gnitest TINU Eovl I";
        String actual = problem5.reverseAndCapitalize(input);

        Assert.assertEquals(expected, actual);
    }
}
