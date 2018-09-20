package poly;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class PersonTest2 {
    @Test(expected = IllegalArgumentException.class)
    public void testExpectedException() {
        new Person("Person", -1);
    }

}
