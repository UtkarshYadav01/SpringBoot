package com.ucode.repository;

import com.ucode.config.HibernateConfig;
import com.ucode.entities.User;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

@Repository
public class DBOperationsImpl implements DBOperations {
    @Override
    public User getUserDetails(long id) {

        User user = null;

        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            user = session.get(User.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}
