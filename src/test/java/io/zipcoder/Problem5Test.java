package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem5Test {

    @Test
    public void reverseStringWithVariableTest() {
        String forwardString = "I love andrew";
        String backwardsExpected = "werdna evol I";
        String actual = new Problem5().reverseStringWithVariable(forwardString);

        Assert.assertEquals(backwardsExpected, actual);
    }

    @Test
    public void reverseStringWithCharacterArrayTest() {
        String forwardString = "I love andrew";
        String backwardsExpected = "werdna evol I";
        String actual = new Problem5().reverseStringWithCharacterArray(forwardString);

        Assert.assertEquals(backwardsExpected, actual);
    }

    @Test
    public void capitalizeFirstLetterOfEveryWordTest() {
        String forwardString = "i love andrew";
        String expectedString = "I Love Andrew";
        String actual = new Problem5().capitalizeFirstLetterOfEveryWord(forwardString);

        Assert.assertEquals(expectedString, actual);
    }
}
