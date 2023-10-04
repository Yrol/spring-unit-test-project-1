package blog.yrol;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * A demo of running test methods randomly using the annotation: @TestMethodOrder(MethodOrderer.Random.class)
 * **/
@TestMethodOrder(MethodOrderer.Random.class)
public class MethodOrderedRandomlyTest {

    @Test
    void testA() {
        System.out.println("Running test A");
    }

    @Test
    void testB() {
        System.out.println("Running test B");
    }

    @Test
    void testC() {
        System.out.println("Running test C");
    }

    @Test
    void testD() {
        System.out.println("Running test D");
    }
}
