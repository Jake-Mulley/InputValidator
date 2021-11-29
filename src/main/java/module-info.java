module cs3318.inputvalidator {
    requires javafx.controls;
    requires javafx.fxml;


    opens cs3318.inputvalidator to javafx.fxml;
    exports cs3318.inputvalidator;
}