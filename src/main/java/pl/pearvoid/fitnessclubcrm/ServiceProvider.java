package pl.pearvoid.fitnessclubcrm;

import pl.pearvoid.fitnessclubcrm.jpa.ContactEntity;
import pl.pearvoid.fitnessclubcrm.jpa.CustomerEntity;
import pl.pearvoid.fitnessclubcrm.jpa.LastMonthClassesEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.Collection;

public class ServiceProvider {
    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY =
            Persistence.createEntityManagerFactory("FitnessClubPU");

    public void addUser(CustomerEntity customerEntity, ContactEntity contactEntity) {
        EntityManager manager = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction transaction = null;
        try {
            transaction = manager.getTransaction();
            transaction.begin();

            manager.persist(contactEntity);

            customerEntity.setContactIdContact(contactEntity.getIdContact());

            manager.persist(customerEntity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null)
                transaction.rollback();
            e.printStackTrace();
        } finally {
            manager.close();
        }
    }

    public Collection<CustomerEntity> getUsers() {
        EntityManager manager = ENTITY_MANAGER_FACTORY.createEntityManager();
        ArrayList<CustomerEntity> entities = new ArrayList<>();
        try {
            entities = (ArrayList<CustomerEntity>) manager.createQuery("from CustomerEntity")
                    .setMaxResults(100)
                    .getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            manager.close();
        }
        return entities;
    }

    public Collection<LastMonthClassesEntity> getLastMonthClasses() {
        EntityManager manager = ENTITY_MANAGER_FACTORY.createEntityManager();
        ArrayList<LastMonthClassesEntity> entities = new ArrayList<>();
        try {
            entities = (ArrayList<LastMonthClassesEntity>) manager.createQuery("from LastMonthClassesEntity")
                    .setMaxResults(100)
                    .getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            manager.close();
        }
        return entities;
    }

}
