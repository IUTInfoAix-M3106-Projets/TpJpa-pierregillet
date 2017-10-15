package fr.univ_amu.iut.tpJPA;

import fr.univ_amu.iut.beans.Module;

import javax.persistence.*;

public class AfficheResponsable {
    public static void main(String[] args) {
        // Initializes the Entity manager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestionPedaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        Module module = em.find(Module.class, "BD");
        System.out.println(module.getResponsable());

        em.close();
        emf.close();
    }
}
