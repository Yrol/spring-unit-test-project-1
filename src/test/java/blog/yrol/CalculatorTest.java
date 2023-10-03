package blog.yrol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

    /**
     * assertEqual
     * **/
    @Test
    void integerDivision() {
        Calculator calculator = new Calculator();
        int result = calculator.integerDivision(4,2);
        assertEquals(2,result);
    }

    /**
     * Using Assertion optional message which will be printed if test fails
     * **/
    @Test
    void integerDivision2() {
        Calculator calculator = new Calculator();
        int dividend = 4;
        int divisor = 2;
        int result = calculator.integerDivision(dividend,divisor);
        result++;
        assertEquals(2,result, String.format("%s/%s didn't produce %s", dividend, divisor, result));
    }

    /**
     * Using the optional message with lambda (()->) to make sure the resources will only be allocated / executed if the test fail (otherwise it'll always be computed).
     * **/
    @Test
    void integerSubtract() {
        Calculator calculator = new Calculator();
        final int minuend = 4;
        final int subtrahend = 3;
        final int result = calculator.integerSubtract(minuend, subtrahend);
        assertEquals(1, result, () -> String.format("%s - %s didn't produce %s", minuend, subtrahend, result));
    }
}
