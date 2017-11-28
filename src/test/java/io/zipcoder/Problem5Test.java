package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem5Test {

    // Input: "I love UNIT Testing"
    // Output: "GnitseT TINU Evol I"

    private String nothing = "";
    private Problem5 problem;

    @Before
    public void setUp() {

        problem = new Problem5();
    }

    @Test
    public void reverse() {
        String expected = "gnitesT TINU eovl I";
        String actual = problem.reverse("I love UNIT Testing");
        Assert.assertEquals(expected, actual);

    }

//    @Test
//    public void capitalize() {
//        String expected = "GnitseT TINU Evol I";
//        String actual = problem.capitalize("gnitesT TINU eovl I");
//        Assert.assertEquals(expected, actual);
//
//    }
}

