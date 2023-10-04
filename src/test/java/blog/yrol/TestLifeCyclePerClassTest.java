package blog.yrol;

import org.junit.jupiter.api.*;

/**
 * Using @TestInstance(TestInstance.Lifecycle.PER_CLASS) to create instance one time only for all the test methods
 * Note: the StringBuilder will NOT be initiated each time and therefore values wil be appended.
 * **/
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestLifeCyclePerClassTest {

    StringBuilder completed = new StringBuilder("");

    @AfterEach
    void afterEach() {
        System.out.println(completed.toString());
    }

    @Order(1)
    @Test
    void testD() {
        System.out.println("Running test D");
        completed.append("1");
    }

    @Order(2)
    @Test
    void testA() {
        System.out.println("Running test A");
        completed.append("2");
    }

    @Order(3)
    @Test
    void testC() {
        System.out.println("Running test C");
        completed.append("3");
    }

    @Order(4)
    @Test
    void testB() {
        System.out.println("Running test B");
        completed.append("4");
    }
}
