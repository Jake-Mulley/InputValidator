import org.junit.Test;

import cs3318.inputvalidator.Main;
import cs3318.inputvalidator.Validator;

import static org.junit.Assert.*;

/**
 * Test class for the testing of Validator
 */
public class TestValidator {
    /**
     * Test which checks if the email has the two required parts of an email, the prefix (before @) and email domain
     * (after the @)
     */
    @Test
    public void testEmailForm() {
        // validator instance to test
        Validator testValidator = new Validator("", "");
        testValidator.setEmail("correct@email.form");
        assertTrue(testValidator.emailFormChecker("correct@email.form"));
        testValidator.setEmail("containsNoAt");
        assertFalse(testValidator.emailFormChecker("containsNoAt"));
        testValidator.setEmail("doesnthavedomain@");
        assertFalse(testValidator.emailFormChecker("doesnthavedomain@"));
        testValidator.setEmail("@doesnthaveprefix");
        assertFalse(testValidator.emailFormChecker("@doesnthaveprefix."));
    }

    @Test
    public void testPasswordStrength() {
        Validator testValidator = new Validator("", "");
        // strong enough password
        assertTrue(testValidator.passwordStrengthChecker("longpassword@123"));
        // test for password length
        assertFalse(testValidator.passwordStrengthChecker("short*"));
        // letters
        assertFalse(testValidator.passwordStrengthChecker("123*"));
        // digits
        assertFalse(testValidator.passwordStrengthChecker("short"));
        // special characters
        assertFalse(testValidator.passwordStrengthChecker("123"));

    }
}


