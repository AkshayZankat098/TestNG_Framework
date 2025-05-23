package org.example;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {

    @Test
    public void testHardAssertion() {

        System.out.println("Hard assertions is START");
        Assert.assertTrue(5 > 10, "HARD Assertion failed : 5 is not greater than 10");
        System.out.println("Hard assertions is END");
    }

    @Test
    public void testSoftAssertion() {

        SoftAssert softAssert = new SoftAssert();
        System.out.println("Soft assertions is START");

        softAssert.assertTrue(5 > 10, "SOFT Assertion failed : 5 is not greater than 10");

        System.out.println("Soft assertions is performed & process is going further for checking");
        softAssert.assertEquals("Hello", "Hello", "Strings match");
        System.out.println("Soft assertions is END");

        // This is important to check all soft assertions
        softAssert.assertAll();
    }

}


//Hard Assertions : A hard assertion stops the test execution as soon as an assertion fails. The next test steps will not be executed.
//Usage : Assert.assertTrue(), Assert.assertFalse(), Assert.assertEquals(), Assert.assertNotEquals(), etc.

//Soft Assertions : A soft assertion allows the test to continue executing even after a failure. The test results will be collected,
// and you can review all the failed assertions at the end of the test.
//Usage : SoftAssert.assertTrue(), SoftAssert.assertFalse(), SoftAssert.assertEquals(), etc.
