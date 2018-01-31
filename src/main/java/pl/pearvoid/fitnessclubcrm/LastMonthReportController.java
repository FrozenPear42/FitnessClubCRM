package pl.pearvoid.fitnessclubcrm;

import javafx.beans.property.ReadOnlyObjectWrapper;
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
import pl.pearvoid.fitnessclubcrm.jpa.LastMonthClassesEntity;

import java.io.IOException;
import java.util.Collection;
import java.util.Date;

public class LastMonthReportController {
    public TableView userTable;
    private Collection<LastMonthClassesEntity> mEntities;

    public void initialize() {
        mEntities = new ServiceProvider().getLastMonthClasses();

        TableColumn<LastMonthClassesEntity, Integer> idCol = new TableColumn<>();
        idCol.setText("Class ID");
        idCol.setCellValueFactory(cellValue -> new SimpleObjectProperty<>(cellValue.getValue().getIdClass()));

        TableColumn<LastMonthClassesEntity, Integer> costCol = new TableColumn<>();
        costCol.setText("Cost");
        costCol.setCellValueFactory(cellValue -> new SimpleObjectProperty<>(cellValue.getValue().getCost()));

        TableColumn<LastMonthClassesEntity, Date> dateCol = new TableColumn<>();
        dateCol.setText("Date");
        dateCol.setCellValueFactory(cellValue -> new SimpleObjectProperty<>(cellValue.getValue().getDate()));

        TableColumn<LastMonthClassesEntity, String> typeCol = new TableColumn<>();
        typeCol.setText("Type");
        typeCol.setCellValueFactory(cellValue -> new ReadOnlyObjectWrapper<>(cellValue.getValue().getType()));

        TableColumn<LastMonthClassesEntity, Integer> sizeCol = new TableColumn<>();
        sizeCol.setText("Size");
        sizeCol.setCellValueFactory(cellValue -> new SimpleObjectProperty<>(cellValue.getValue().getSize()));

        TableColumn<LastMonthClassesEntity, Integer> durationCol = new TableColumn<>();
        durationCol.setText("Duration");
        durationCol.setCellValueFactory(cellValue -> new SimpleObjectProperty<>(cellValue.getValue().getDuration()));


        userTable.getColumns().addAll(idCol, costCol,dateCol, typeCol, sizeCol, durationCol);

        userTable.setItems(FXCollections.observableArrayList(mEntities));

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
