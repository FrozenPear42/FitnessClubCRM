package pl.pearvoid.fitnessclubcrm;

import pl.pearvoid.fitnessclubcrm.jpa.ContactEntity;
import pl.pearvoid.fitnessclubcrm.jpa.CustomerEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.sql.Timestamp;

public class ServiceProvider {
    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY =
            Persistence.createEntityManagerFactory("FitnessClubPU");

    public void addUser(String name, Integer age, Timestamp timestamp, ContactEntity contactEntity) {
        EntityManager manager = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction transaction = null;
        try {
            transaction = manager.getTransaction();
            transaction.begin();

            CustomerEntity customer = new CustomerEntity();
            customer.setName("xDDDDDDDDDDDDD");

            manager.persist(customer);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null)
                transaction.rollback();
            e.printStackTrace();
        } finally {
            manager.close();
        }
    }
}
