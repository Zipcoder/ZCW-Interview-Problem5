package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem5Test {
    Problem5 problem5;

    @Before
    public void setUp() {
        problem5 = new Problem5();
    }

    @Test
    public void reverseStringTest() {
        String input = "Testing";
        String expected = "gnitseT";

        String actual = problem5.reverseString(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void allCapsTestTrue() {
        Assert.assertTrue(problem5.allCaps("ABCD"));
    }

    @Test
    public void allCapsTestFalse() {
        Assert.assertFalse(problem5.allCaps("ABcD"));
    }

    @Test
    public void makeAllLowerCaseTest() {
        String input = "ADBF";
        String expected = "adbf";

        String actual = problem5.makeAllLowerCase(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void makeFirstLetterUpperCaseTest() {
        String input = "adsf";
        String expected = "Adsf";

        String actual = problem5.makeFirstLetterUpperCase(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkStringTest1() {
        String input = "UNIT";
        String expected = "UNIT";

        String actual = problem5.checkString(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkStringTest2() {
        String input = "UNiT";
        String expected = "Unit";

        String actual = problem5.checkString(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkWordTest() {
        String[] testArr = {"wes", "connors"};
        char[] expected = {'W', 'e', 's', ' ', 'C', 'o', 'n', 'n', 'o', 'r', 's'};

        char[] actual = problem5.checkWords(testArr);

        Assert.assertEquals(expected[10], actual[10]);
    }

    @Test
    public void makeStringTest() {
        char[] testArray = {'w', 'e', 's'};
        String expected = "wes";
        String actual = problem5.makeString(testArray);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseTest() {
        String input = "I love UNIT Testing";
        String expected = "Gnitset TINU Evol I";

        String actual = problem5.reverse(input);

        Assert.assertEquals(expected, actual);
    }
}
