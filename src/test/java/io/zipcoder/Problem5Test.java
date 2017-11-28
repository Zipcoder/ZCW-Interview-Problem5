package io.zipcoder;

import org.junit.Test;
import org.junit.Assert;

public class Problem5Test {

    Problem5 problem5 = new Problem5();

    @Test
    public void reverseTheString(){
        String[] arr = {"I love UNIT Testing"};
        String expected = "Gnitest TINU Eovl I";
        String actual = problem5.reverseTheString(arr);
        Assert.assertEquals(expected,actual);
    }
}//not working
