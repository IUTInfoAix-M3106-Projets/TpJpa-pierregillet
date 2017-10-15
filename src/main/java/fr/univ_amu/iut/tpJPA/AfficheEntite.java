package fr.univ_amu.iut.tpJPA;

import fr.univ_amu.iut.beans.Etudiant;
import fr.univ_amu.iut.beans.Module;

import javax.persistence.*;

public class AfficheEntite {
    public static void main(String[] args) {
        // Initializes the Entity manager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestionPedaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        Etudiant etudiant = em.find(Etudiant.class, 1106);
        System.out.println(etudiant);

        em.close();
        emf.close();
    }

    public static class AjouteEntite {
        public static void main(String[] args) {
            // Initializes the Entity manager
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestionPedaPU");
            EntityManager em = emf.createEntityManager();
            EntityTransaction tx = em.getTransaction();

            Module module = new Module();
            module.setCode("42");

            tx.begin();
            em.persist(module);
            tx.commit();

            System.out.println(module);

            tx.begin();
            em.remove(module);
            tx.commit();

            em.close();
            emf.close();
        }
    }
}
