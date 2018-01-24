package pl.pearvoid.fitnessclubcrm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pl.pearvoid.fitnessclubcrm.jpa.CustomerEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main extends Application {

    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("FitnessClubPU");

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("/ui/sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();


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
