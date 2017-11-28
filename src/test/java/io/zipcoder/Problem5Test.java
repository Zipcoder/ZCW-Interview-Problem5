package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem5Test {

    @Test
    public void reverseTest(){
        String input = "I love UNIT Testing";
        String expected = "Gnitest TINU Eovl I";

        String actual = new Problem5().reverseString(input);

        Assert.assertEquals(expected,actual);
    }
}
