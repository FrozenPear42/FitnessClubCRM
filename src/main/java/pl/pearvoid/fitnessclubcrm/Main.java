package pl.pearvoid.fitnessclubcrm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pl.pearvoid.fitnessclubcrm.jpa.ContactEntity;
import pl.pearvoid.fitnessclubcrm.jpa.CustomerEntity;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Timestamp;
import java.time.Instant;

public class Main extends Application {

    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("FitnessClubPU");

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/ui/main.fxml"));
        primaryStage.setTitle("Fitness Club");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        new ServiceProvider().getUsers().forEach(c -> System.out.printf("%d\t%s\t%d\n", c.getIdCustomer(), c.getName(), c.getAge()));
    }


    public static void main(String[] args) {
        launch(args);
    }
}
