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

        Parent root = FXMLLoader.load(getClass().getResource("/ui/sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

        ServiceProvider serviceProvider = new ServiceProvider();

        CustomerEntity customer = new CustomerEntity();
        customer.setName("elo elo elo");

        Instant now = Instant.now();
        customer.setFirstVisitDate(Timestamp.from(now));
        customer.setAge(69);

        ContactEntity contact = new ContactEntity();
        contact.setAddress("bzdziszewo");
        contact.setEmail("wo@wo.pl");
        contact.setPhone("43242323424");

        serviceProvider.addUser(customer, contact);



//        EntityManager manager = ENTITY_MANAGER_FACTORY.createEntityManager();
//        EntityTransaction transaction = null;
//        try {
//            transaction = manager.getTransaction();
//            transaction.begin();
//
//            CustomerEntity customer = new CustomerEntity();
//            customer.setName("xDDDDDDDDDDDDD");
//
//            manager.persist(customer);
//            transaction.commit();
//        } catch (Exception e) {
//            if (transaction != null)
//                transaction.rollback();
//            e.printStackTrace();
//        } finally {
//            manager.close();
//        }

    }


    public static void main(String[] args) {
        launch(args);
    }
}
