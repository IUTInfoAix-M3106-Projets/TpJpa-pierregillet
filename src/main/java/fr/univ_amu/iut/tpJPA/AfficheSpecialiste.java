package fr.univ_amu.iut.tpJPA;

import fr.univ_amu.iut.beans.*;

import javax.persistence.*;

public class AfficheSpecialiste {
    public static void main(String[] args) {
        // Initializes the Entity manager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestionPedaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        Module mod = em.find(Module.class, "BD");
        System.out.println(mod.getSpecialistes());


        em.close();
        emf.close();
    }
}
