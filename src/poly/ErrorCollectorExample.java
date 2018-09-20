package poly;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class ErrorCollectorExample {
    @Rule
    public ErrorCollector errorCollector = new ErrorCollector();

    @Test
    public void example() {
        errorCollector.addError(new Throwable("First line"));

        errorCollector.addError(new Throwable("Second line"));

        System.out.println("Hello");

        try {
            Assert.assertTrue("A" == "B");
        } catch (Throwable t) {
            errorCollector.addError(t);
        }
        System.out.println("World !!!");
    }


}
