package com.example.lab3.dao;

import com.example.lab3.dto.PointDto;
import com.example.lab3.entity.PointEntity;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import org.hibernate.Session;

import java.util.List;
@Named(value = "pointDao")
@ApplicationScoped
public class PointDao {


    public void create(PointDto pointDto, Session session) {
        session.save(new PointEntity(pointDto));
    }

    public List<PointEntity> getAll(Session session) {
        return session.createQuery("from PointEntity", PointEntity.class)

                .getResultList();
    }
}
