package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem5Test
{

    @Test
    public void reverseThisStringTest1()
    {
        //Given
        Problem5 problem5 = new Problem5();
        String text = "hello";
        String expected = "Olleh";

        //When
        String actual = problem5.reverseThisWord(text);

        //Then
        Assert.assertEquals(expected, actual);


    }

}
