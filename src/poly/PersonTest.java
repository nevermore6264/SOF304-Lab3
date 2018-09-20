package poly;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class PersonTest {
    @Rule
    public ExpectedException expectException = ExpectedException.none();

    @Test
    public void testExpectedException() {
        expectException.expect(IllegalArgumentException.class);

        new Person("Person", -1);
    }

}