package cs3318.inputvalidator;

public class Validator {

    private String email;
    private String password;

    public Validator(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public boolean emailFormChecker(String email) {
        boolean result = false;
        for (int i = 0; i < email.length(); i++) {
            if ( (int) email.charAt(i) == 64) {
                result = true;
            }
        }
        return result;
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
