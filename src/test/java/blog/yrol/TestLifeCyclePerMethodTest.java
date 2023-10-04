package blog.yrol;

import org.junit.jupiter.api.*;

/**
 * By default, a new test class instance will be created for each test method. Although this is the default behaviour oj JUnit a class can still be annotated with @TestInstance(TestInstance.Lifecycle.PER_METHOD)
 * Note: the StringBuilder will be added initiated each time and will be assigned with a new value.
 * **/

//@TestInstance(TestInstance.Lifecycle.PER_METHOD) not required since this is default
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestLifeCyclePerMethodTest {

    StringBuilder completed = new StringBuilder("");

    @AfterEach
    void afterEach() {
        System.out.println(completed.toString());
    }

    @Order(1)
    @Test
    void testD() {
        System.out.println("Running test D");
        completed.append("State of instance object is: 1");
    }

    @Order(2)
    @Test
    void testA() {
        System.out.println("Running test A");
        completed.append("State of instance object is: 2");
    }

    @Order(3)
    @Test
    void testC() {
        System.out.println("Running test C");
        completed.append("State of instance object is: 3");
    }

    @Order(4)
    @Test
    void testB() {
        System.out.println("Running test B");
        completed.append("State of instance object is: 4");
    }
}
