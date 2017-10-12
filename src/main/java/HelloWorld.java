

/**
 * Created by sripa on 7/4/2017.
 */


public class HelloWorld {

    private String testString = null;

    public String getInstance() throws Exception {
        if (testString == null) {
            testString = "Test String";
        }
        return testString;
    }

}
