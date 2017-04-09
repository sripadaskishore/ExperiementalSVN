import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by sripa on 9/4/2017.
 */
public class MathOperationsTest {

    private static MathOperations mathoOperations;

    @BeforeClass
    public static void setup() {
        mathoOperations = mock(MathOperations.class);
        when(mathoOperations.add(2, 3)).thenReturn(5);
        when(mathoOperations.subtract(2, 3)).thenReturn(-1);
        when(mathoOperations.multiply(2, 3)).thenReturn(6);
        when(mathoOperations.divide(2, 2)).thenReturn(1);

    }

    @Test
    public void add() {
        try {
            Assert.assertEquals(mathoOperations.add(2, 3), 5);
            System.out.println("Test Successful");
        } catch (Exception ex) {
            System.out.println("Test Failed with exception " + ex);
        }
    }
}