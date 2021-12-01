package cs3318.inputvalidator;

public class Validator {

    private String email;
    private String password;

    public Validator(String email, String password) {
        this.email = email;
        this.password = password;
    }

    /**
     * checks if string is a well-form email address
     *
     * @param email String email address of user
     * @return boolean which indicates whether the string email is well-formed
     */
    public boolean emailFormChecker(String email) {
        boolean result = false;
        String domain;
        String[] sepEmail = email.split("@");
        if (sepEmail.length != 2) {
            return false;
        }
        domain = sepEmail[1];
        String[] sepDomain = domain.split("\\.");
        return sepDomain.length == 2;
    }

    /**
     * checks if the password is strong enough (>6 characters, at least one letter, digit and special character)
     *
     * @param password String for a password
     * @return boolean indicates whether the password is strong enough
     */
    public boolean passwordStrengthChecker(String password) {
        if (password.length() > 6) {
            boolean letter = false;
            boolean digit = false;
            boolean specialCharacter = false;
            for (int i = 0; i < password.length(); i++) {
                if ( (int) password.charAt(i) > 96 && (int) password.charAt(i) < 123 || (int) password.charAt(i) > 64 && (int) password.charAt(i) < 91) {
                    letter = true;
                } else if ((int) password.charAt(i) > 47 && (int) password.charAt(i) < 58) {
                    digit = true;
                } else if ((int) password.charAt(i) == 42 || (int) password.charAt(i) == 94 || (int) password.charAt(i) == 38 || (int) password.charAt(i) == 64 || (int) password.charAt(i) == 33) {
                    specialCharacter = true;
                }
                if (letter && digit && specialCharacter) {
                    return true;
                }
            }
        }
        return false;
    }

    public String getEmail() {
        return this.email;
    }
    public String getPassword() {
        return this.password;
    }
    public void setEmail(String email) {
         this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
