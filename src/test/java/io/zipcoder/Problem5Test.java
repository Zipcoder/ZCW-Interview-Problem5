package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem5Test {

    @Test
    public void testCapitalize(){
        Problem5 test = new Problem5();
        String input = "I love UNIT Testing";
        String expected = "I Love UNIT Testing";
        String actual = test.capitalizeFirstCharacter(input);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testReverseString1(){
        Problem5 test = new Problem5();
        String input = "I love UNIT Testing";
        String expected = "GnitseT TINU Evol I";
        String actual  = test.reverseAndCapitalize(input);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testReverseString2() {
        Problem5 test = new Problem5();
        String input = "zip code is awesome";
        String expected = "Emosewa Si Edoc Piz";
        String actual = test.reverseAndCapitalize(input);
        Assert.assertEquals(expected, actual);
    }

}
