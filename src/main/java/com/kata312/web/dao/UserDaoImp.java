package com.kata312.web.dao;

import com.kata312.web.models.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class UserDaoImp implements UserDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers(){
        return entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();
    }
    @Override
    public User getUser(int id){
        return entityManager.find(User.class,id);
    }
    @Override
    public void saveUser(User user) {
        entityManager.persist(user);
    }
    @Override
    public void updateUser(User user){
        entityManager.merge(user);
    }
    @Override
    public void deleteUser(int id){
        entityManager.remove(getUser(id));
    }
}
