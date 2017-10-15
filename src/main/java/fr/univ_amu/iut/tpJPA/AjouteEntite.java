package fr.univ_amu.iut.tpJPA;

import fr.univ_amu.iut.beans.*;

import javax.persistence.*;

public class AjouteEntite {
    public static void main(String[] args) {
        // Initializes the Entity manager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestionPedaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        Module module = new Module();
        module.setCode("test");
        em.persist(module);
        tx.commit();

        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        tx.begin();
        em.remove(module);
        tx.commit();

        em.close();
        emf.close();
    }
}
