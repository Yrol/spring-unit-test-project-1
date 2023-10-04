package blog.yrol;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Naming convention pattern - test<System Under Test>_<Condition or state change>_<Expected result>
 * @DisplayName - will allow to provide a name.
 **/

@DisplayName("Test Math operations in Calculator class")
public class CalculatorTest {

    Calculator calculator;

    /**
     * Execute one time only before executing all test methods
     * It needs to be a static method
     * **/
    @BeforeAll
    static void setup() {
        System.out.println("Execute @BeforeAll method.");
    }

    /**
     * Execute one time only after executing all test methods
     * It needs to be a static method
     * **/
    @AfterAll
    static void cleanup() {
        System.out.println("Execute @AfterAll method.");
    }

    /**
     * Execute everytime before executing all test methods
     * Creates a Calculator method each time before executing a test method
     * Not a static method.
     * **/
    @BeforeEach
    void beforeEachTestMethod() {
        calculator = new Calculator();
    }

    /**
     * Execute after each test method. Ex: clean up resources such as DB connections & etc
     * Not a static method
     */
    @AfterEach
    void afterEachTestMethod() {
        System.out.println("Execute @AfterEach method.");
    }


    /**
     * assertEqual
     * **/
    @DisplayName("Test 4 / 2 = 2")
    @Test
    void test_integerDivision_WhenFourIsDividedByTwo_ShouldReturnTwo() {
        int result = calculator.integerDivision(4,2);
        assertEquals(2,result);
    }

    /**
     * Using Assertion optional message which will be printed if test fails
     * **/
    @DisplayName("Test 4 / 2 = 3")
    @Test
    void test_integerDivision_WhenFourIsDividedByTwo_ShouldNotReturnThree() {
        int dividend = 4;
        int divisor = 2;
        int result = calculator.integerDivision(dividend,divisor);
        result++;
        assertEquals(2,result, String.format("%s/%s didn't produce %s", dividend, divisor, result));
    }

    /**
     * Using the optional message with lambda (()->) to make sure the resources will only be allocated / executed if the test fail (otherwise it'll always be computed).
     * **/
    @DisplayName("Test 4 - 3 = 1")
    @Test
    void when_integerSubtract_FourMinusThree_ShouldReturnOne() {
        final int minuend = 4;
        final int subtrahend = 3;
        final int result = calculator.integerSubtract(minuend, subtrahend);
        assertEquals(1, result, () -> String.format("%s - %s didn't produce %s", minuend, subtrahend, result));
    }

    /**
     * Example of disabling a failing test case (instead of commenting out or removing the @Test tag)
     * **/
    @Disabled("TO DO: Need to work on it")
    @DisplayName("Division by zero")
    @Test
    void test_integerDivision_whenDivideByZero_shouldReturnError() {
        fail("Cannot divide by zero");
    }

    /**
     * Example of a test with exception
     * **/
    @DisplayName("Division by zero exception")
    @Test
    void test_integerDivision_whenDivideByZero_shouldThrowAnException() {

        int dividend = 4;
        int divisor = 0;
        String expectedExceptionMessage = "/ by zero";

        ArithmeticException actualException = assertThrows(ArithmeticException.class, () -> {
            calculator.integerDivision(dividend,divisor);
        });

        assertEquals(expectedExceptionMessage, actualException.getMessage());
    }
}
