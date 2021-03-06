package com.app.app.repository;

import com.app.app.entity.Reservation;
import org.hibernate.query.internal.QueryImpl;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class GeneralRepository {

    @PersistenceContext
    EntityManager entityManager;


    public List<String> findField(String field){
        Query query = entityManager.createNativeQuery("select distinct " + field + " from expert_customize");
        return query.getResultList();
    }

    public List<Reservation> searchField(String field, String value) {
        Query query = entityManager.createNativeQuery("select * from reservation where " + field + "='" + value + "'");
        return query.getResultList();
    }
}
