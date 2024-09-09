package jpashop.jpastudy;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jpashop.jpastudy.domain.Book;
import jpashop.jpastudy.domain.Item;

public class jpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        //code

        try{

            Book book = new Book();
            book.setName("jpa");
            book.setAuthor("김영한");
            em.persist(book);

            tx.commit();
        }catch (Exception e){
            tx.rollback();
        }finally{
            em.close();
        }


        emf.close();
    }
}
