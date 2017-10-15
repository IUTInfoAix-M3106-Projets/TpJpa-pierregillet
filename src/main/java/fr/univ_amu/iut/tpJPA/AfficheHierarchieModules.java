package fr.univ_amu.iut.tpJPA;

import fr.univ_amu.iut.beans.*;

import javax.persistence.*;

public class AfficheHierarchieModules {
    public static void main(String[] args) {
        // Initializes the Entity manager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestionPedaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();


        Module module = em.find(Module.class, "BD");

        while (module != null) {
            System.out.println(module);
            module = module.getPere();
        }
        em.close();
        emf.close();
    }
}
