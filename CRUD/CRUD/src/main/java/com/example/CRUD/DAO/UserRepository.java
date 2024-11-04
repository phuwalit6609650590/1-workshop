package com.example.CRUD.DAO;

import com.example.CRUD.entity.Users;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository implements usersDAO{

    private EntityManager entityManager;

    @Autowired
    public UserRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public Users save(Users user) {
        entityManager.persist(user);
        return  user;
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        Users user= entityManager.find(Users.class,id);
        entityManager.remove(user);
    }

    @Override
    public Users get(Integer id) {
        return entityManager.find(Users.class,id);
    }

    @Override
    public List<Users> getAll() {
        TypedQuery<Users> query = entityManager.createQuery("FROM Users",Users.class);
        return query.getResultList();
    }

    @Override
    @Transactional
    public void update(Users user) {
        entityManager.merge(user);
    }


}
