package cs3318.inputvalidator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

/**
 *
 */
public class InputControl {
    @FXML
    private Label response;
    @FXML
    private TextField emailTextField;
    @FXML
    private PasswordField passwordTextField;

    Validator validator = new Validator("", "");

    /**
     * When submit button is clicked runs validator methods to check input received (email form / password strength)
     * @param event submit button pressed
     */
    @FXML
    protected void onSubmitButtonClick(ActionEvent event) {
        String receivedEmail = emailTextField.getText();
        String receivedPassword = passwordTextField.getText();
        if (validator.emailFormChecker(receivedEmail)) {
            if (validator.passwordStrengthChecker(receivedPassword)) {
                response.setText("Input valid");
            } else {
                response.setText("Password not strong enough");
            }
        } else {
            response.setText("Invalid E-mail not well-formed");
        }


    }
}