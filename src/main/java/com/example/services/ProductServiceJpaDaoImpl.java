package com.example.services;

import com.example.domain.Product;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.List;

/**
 * Created by Sergey Alekseev on 18.10.2016.
 */

@Service
@Profile("jpadao")
public class ProductServiceJpaDaoImpl implements ProductService {

    EntityManagerFactory emf;

    @PersistenceUnit
    public void setEmf(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public List<?> listAll() {
        EntityManager em = emf.createEntityManager();
        return em.createQuery("from Product",Product.class).getResultList();
    }

    @Override
    public Product getById(Integer id) {
        EntityManager em = emf.createEntityManager();

        return em.find(Product.class,id);
    }

    @Override
    public Product saveOrUpdate(Product object) {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Product savedProduct = em.merge(object);
        em.getTransaction().commit();

        return savedProduct;
    }

    @Override
    public void delete(Integer id) {
        EntityManager em = emf.createEntityManager();

        em.getTransaction();
        em.remove(em.find(Product.class, id));
        em.getTransaction().commit();

    }
}
