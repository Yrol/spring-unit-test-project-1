package blog.yrol;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


/**
 * A demo of running test methods in alphabetical order using the annotation: @TestMethodOrder(MethodOrderer.MethodName.class)
 * Although the test cases are ordered randomly below, the execution will occur in order A, B, C, D
 * **/
@TestMethodOrder(MethodOrderer.MethodName.class)
public class MethodsOrderedByNameTest {

    @Test
    void testD() {
        System.out.println("Running test D");
    }

    @Test
    void testA() {
        System.out.println("Running test A");
    }

    @Test
    void testC() {
        System.out.println("Running test C");
    }

    @Test
    void testB() {
        System.out.println("Running test B");
    }
}
