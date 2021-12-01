import org.junit.Test;

import cs3318.inputvalidator.Main;
import cs3318.inputvalidator.Validator;

import static org.junit.Assert.*;

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
        assertTrue(testValidator.emailFormChecker("contains@inString"));
        testValidator.setEmail("containsNoAt");
        assertFalse(testValidator.emailFormChecker("containsNoAt"));
    }

    /**
     * Test which checks if the email has the two required parts of an email, the prefix (before @) and email domain
     * (after the @)
     */
    @Test
    public void testForDomains() {
        // validator instance to test
        Validator testValidator = new Validator("", "");
        testValidator.setEmail("correct@email.form");
        assertTrue(testValidator.emailFormChecker("correct@email.form"));
        testValidator.setEmail("containsNoAt");
        assertFalse(testValidator.emailFormChecker("containsNoAt"));
        testValidator.setEmail("doesnthavedomain@");
        assertFalse(testValidator.emailFormChecker("doesnthavedomain@"));
        testValidator.setEmail("@doesnthaveprefix");
        assertFalse(testValidator.emailFormChecker("@doesnthaveprefix"));
    }
}


