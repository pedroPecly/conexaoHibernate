package view;

import javax.persistence.EntityManager;

import controller.ConnFactory;
import model.Ovo;

public class Principal {

    public static void main(String[] args) {
        Ovo ovo = new Ovo("caipiria2", 21.89);
        EntityManager em = ConnFactory.getEntityManager();

        em.getTransaction().begin();
        em.persist(ovo);
        em.getTransaction().commit();
        em.close();
    }
}
