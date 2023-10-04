package blog.yrol;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * A demo of running test methods in alphabetical order using the annotation: @TestMethodOrder(MethodOrderer.MethodName.class)
 * Use case: when we need to perform DB operations create a record, update it and view again for teh updated results
 * The following will always in order: D, C, A, B
 * **/

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodsOrderedByOrderIndexTest {

    @Order(1)
    @Test
    void testD() {
        System.out.println("Running test D");
    }

    @Order(3)
    @Test
    void testA() {
        System.out.println("Running test A");
    }

    @Order(2)
    @Test
    void testC() {
        System.out.println("Running test C");
    }

    @Order(4)
    @Test
    void testB() {
        System.out.println("Running test B");
    }
}
