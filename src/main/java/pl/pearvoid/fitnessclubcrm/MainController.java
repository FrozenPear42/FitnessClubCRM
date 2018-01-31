package pl.pearvoid.fitnessclubcrm;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    public Button classesButton;
    public Button staffButton;
    public Button customersButton;
    public Button exitButton;


    public void onCustomerButton(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/ui/userList.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Customer Details");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onStaffButton(ActionEvent actionEvent) {

    }

    public void onClassesButton(ActionEvent actionEvent) {

    }

    public void onExitButton(ActionEvent actionEvent) {

    }
}
