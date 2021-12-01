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
        String domain;
        String[] sepEmail = email.split("@");
        if (sepEmail.length != 2) {
            return false;
        }
        domain = sepEmail[1];
        String[] sepDomain = domain.split("\\.");
        return sepDomain.length == 2;
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
