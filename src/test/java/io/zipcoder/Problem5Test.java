package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem5Test {

    private Problem5 problem5 = new Problem5();
    private String testedString = "I love UNIT Testing";

    @Test
    public void reverseStringAndCapitalizeFirstLetterTest(){
        String expected = "Gnitest TINU Evol I";
        String actual = problem5.reverseStringAndCapitalizeFirstLetter(testedString);
        Assert.assertEquals(expected, actual);
    }
}
