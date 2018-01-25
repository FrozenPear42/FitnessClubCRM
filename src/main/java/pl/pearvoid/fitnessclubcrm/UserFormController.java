package pl.pearvoid.fitnessclubcrm;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class UserFormController {
    public TextField name;
    public TextField age;
    public TextField address;
    public TextField city;
    public TextField zipcode;
    public TextField email;
    public BorderPane root;

    public void onBack(ActionEvent actionEvent) {
        Stage stage = (Stage) root.getScene().getWindow();
        stage.close();
    }

    public void onSubmit(ActionEvent actionEvent) {
        Stage stage = (Stage) root.getScene().getWindow();
        stage.close();
    }
}
