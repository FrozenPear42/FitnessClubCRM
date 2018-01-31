package pl.pearvoid.fitnessclubcrm;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import pl.pearvoid.fitnessclubcrm.jpa.CustomerEntity;

import java.io.IOException;
import java.util.Collection;

public class LastMonthReportController {
    public TableView userTable;
    private Collection<CustomerEntity> mCustomers;

    public void initialize() {
        mCustomers = new ServiceProvider().getUsers();

        TableColumn<CustomerEntity, Integer> idCol = new TableColumn<>();
        idCol.setText("ID");
        idCol.setCellValueFactory(cellValue -> new SimpleObjectProperty<>(cellValue.getValue().getIdCustomer()));

        TableColumn<CustomerEntity, String> nameCol = new TableColumn<>();
        nameCol.setText("Name");
        nameCol.setCellValueFactory(cellValue -> new ReadOnlyStringWrapper(cellValue.getValue().getName()));

        TableColumn<CustomerEntity, Integer> ageCol = new TableColumn<>();
        ageCol.setText("Age");
        ageCol.setCellValueFactory(cellValue -> new SimpleObjectProperty<>(cellValue.getValue().getAge()));

        userTable.getColumns().addAll(idCol, nameCol, ageCol);

        userTable.setItems(FXCollections.observableArrayList(mCustomers));

    }

    public void back(ActionEvent actionEvent) {

    }

    public void add(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/ui/userForm.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Customer List");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
