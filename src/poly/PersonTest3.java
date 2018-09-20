package poly;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class PersonTest3 {
    @Test
    public void testExpectedException3() {
        try {
            new Person("Person", -1);
            fail("Invalid");
        } catch (IllegalArgumentException e) {

        }
    }

}
