

/**
 * Created by sripa on 7/4/2017.
 */

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
public class HelloWorldTest {

    @Test
    public void testHelloWorld() {
        System.out.println("Testing Hello World");
        Assert.assertEquals(false, true);
    }
}
