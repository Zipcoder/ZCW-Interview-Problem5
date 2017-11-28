package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem5Test {
    Problem5 problem5=new Problem5();
    @Test
    public void reverseTest(){
        String s="I love UNIT Testing";
        String expected="Gnitest TINU Eovl I";
        String actual=problem5.reverse(s);

        Assert.assertEquals(expected,actual);
    }
}
