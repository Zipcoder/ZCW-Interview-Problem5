package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem5Test {

    // Input: "I love UNIT Testing"
    // Output: "Gnitest TINU Eovl I"

    private String nothing = "";
    private Problem5 problem;

    @Before
    public void setUp() {

        problem = new Problem5();
    }

    @Test

    public void reverse() {
        String expected = " gnitesT TINU eovl I";
        String actual = problem.reverse();
        Assert.assertEquals(expected, actual);

    }

    @Test
      public void capitalizeFirstWord(){


      }


    @Test
    public void noInputReverseTest(){
        Boolean actual = Boolean.TRUE;
        Boolean expected = problem.reverse(nothing);
        Assert.assertEquals(expected, actual);
    }


    @Test
      public void noInputCapitalizeTest(){
      Boolean actaul = Boolean.TRUE;
      Boolean expected = problem.reverse(nothing);
      Assert.assertEquals(expected, actual);
}


}