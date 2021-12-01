import org.junit.Test;
import static org.junit.Assert.assertEquals;
import cs3318.inputvalidator.Main;
import cs3318.inputvalidator.Validator;

/**
 * Test class for the testing of Validator
 */
public class TestValidator {
    /**
     * Test that it checks for a @ in a given string, returns true if @ is present in string
     *
     */
    @Test
    public void testForAt() {
        // validator instance to test
        Validator testValidator = new Validator("", "");
        testValidator.setEmail("contains@inString");
        assertEquals(true, testValidator.emailFormChecker());
        testValidator.setEmail("containsNoAt");
        assertEquals(false, testValidator.emailFormChecker());
    }
}


