import calculator.Calc;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CalculatorTest {

    @Test
    public void calculatorDigitTest() {
        Assert.assertEquals(Calc.getScreenDigits(), 10);
        Assert.fail("Error message pop up!");

    }

    @Test
    public void calcSumPositiveValuesTest() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(new Calc().sum(2, 2), 5, "Error in line 17");
        softAssert.assertEquals(new Calc().sum(0, -2), -2, "Error in line 18");
        softAssert.assertEquals(new Calc().sum(0, 0), 0, "Error in line 19");
        softAssert.assertEquals(new Calc().sum(222000000, 100000001), 322000000, "Error in line 20");
        softAssert.assertEquals(new Calc().sum(-2, -2), -4, "Error in line 21");
        softAssert.assertAll();
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void calcDivideByZero() {
        Assert.assertEquals(new Calc().divide(4, 0), 0);
    }

}
