package view;

import javax.persistence.EntityManager;

import java.util.List;

import model.Contato;
import model.dao.ConnFactory;

public class Principal {

    public static void main(String[] args) {
        Contato c = new Contato("ovo", "12345678", "ovo.com");

        /*
        
            EntityManager em = ConnFactory.getEntityManager();

            em.getTransaction().begin();

            // inclusao
            em.persist(c);

            // ediçao
            c.setId(2);
            c.setNome("ovo alterado");
            em.merge(c);

            // exclusao
            em.remove(em.find(Contato.class, 1)); // em.find para buscar

            // listar
            List<Contato> lista = em.createQuery("FROM Contato c").getResultList();
            for (Contato c1 : lista) {
                System.out.println(c1);
            }

            // enviando todas as ordens necessarias
            em.getTransaction().commit();
            em.close();

        */
    }
}
