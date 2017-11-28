package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem5Test {

    @Test
    public void testReverseString(){
        Problem5 test = new Problem5();
        String input = "I love UNIT Testing";
        String expected = "gnitseT TINU evol I";
        String actual = test.reverseString(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCapitalizeLast(){
        Problem5 test = new Problem5();
        String input = "I love UNIT Testing";
        String expected = "I lovE UNIT testinG";
        String actual = test.capitalizeLast(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFinalOutput(){
        Problem5 test = new Problem5();

        String input="I love UNIT Testing";
        String expected="Gnitset TINU Evol I";
        String actual = test.finalOutput(input);

        Assert.assertEquals(expected, actual);
    }

}
