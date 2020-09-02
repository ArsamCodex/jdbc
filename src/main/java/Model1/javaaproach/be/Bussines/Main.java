package Model1.javaaproach.be.Bussines;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public static  void main (String [] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dataSource");
        EntityManager em = emf.createEntityManager();


        EntityTransaction et = em.getTransaction();
        et.begin();

        et.commit();
        em.close();
        emf.close();
    }
}
