package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem5Test {

    private Problem5 problem5Tester;

    @Before
    public void setup() {
        problem5Tester = new Problem5();

    }

    @Test
    public void reverseTest1() {
        String input = "I love UNIT testing";
        String expected = "gnitset TINU evol I";
        String actual = problem5Tester.reverseString(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void count() {
        String input = "I love UNIT Testing";
        System.out.println(input.length());

    }



    @Test
    public void outputTest() {
        System.out.println('H' + 'e' + "llo");
    }


}
