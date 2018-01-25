package pl.pearvoid.fitnessclubcrm;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import pl.pearvoid.fitnessclubcrm.jpa.ContactEntity;
import pl.pearvoid.fitnessclubcrm.jpa.CustomerEntity;

import java.sql.Timestamp;
import java.time.Instant;

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


        ServiceProvider serviceProvider = new ServiceProvider();

        CustomerEntity customer = new CustomerEntity();
        customer.setName(name.getText());

        Instant now = Instant.now();
        customer.setFirstVisitDate(Timestamp.from(now));
        customer.setAge(Integer.parseInt(age.getText()));

        ContactEntity contact = new ContactEntity();
        contact.setAddress(String.format("%s, %s %s", address.getText(), zipcode.getText(), city.getText()));
        contact.setEmail(email.getText());
        contact.setPhone("43242323424");

        serviceProvider.addUser(customer, contact);

        Stage stage = (Stage) root.getScene().getWindow();
        stage.close();
    }
}
