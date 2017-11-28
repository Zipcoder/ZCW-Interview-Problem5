package io.zipcoder;
import org.junit.*;

public class Problem5Test {

    @Test
    public void reverseStringTest(){

        String input = "I love UNIT Testing";

        String expected = "Gnitest TINU Eovl I";

        String actual = Problem5.reverseString();

        Assert.assertEquals(expected,actual);

    }


}
