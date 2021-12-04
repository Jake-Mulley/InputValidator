package cs3318.inputvalidator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * input application which runs javafx to receive input
 */
public class InputApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(InputApplication.class.getResource("validator.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        stage.setTitle("User Information Form");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * main method to launch application
     *
     * @param args .
     */
    public static void main(String[] args) {
        launch();
    }
}