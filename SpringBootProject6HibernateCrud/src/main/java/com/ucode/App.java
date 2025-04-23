package com.ucode;

import com.ucode.entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("/hibernate.cfg.xml");

        SessionFactory sessionFactory = cfg.buildSessionFactory();//creates session objects
        Session session = sessionFactory.openSession();//Session provides CRUD operation methods
        Transaction transaction = session.beginTransaction();//provides translation support

        //-----------------------INSERT OPERATION------------------------------------
        /*User user1 = new User();
        user1.setId(1);
        user1.setName("Utkarsh");
        user1.setEmail("Utkarsh@Gmail.com");
        user1.setPassword("1234");
        user1.setGender("Male");
        user1.setCity("Agra");*/

        /*User user3 = new User();
        user3.setName("Amit");
        user3.setEmail("Amit@Gmail.com");
        user3.setPassword("amit1234");
        user3.setGender("Male");
        user3.setCity("Chandigarh");*/

        /*try {
            session.save(user3);
            transaction.commit();

            System.out.println("######### USER DETAILS ADDED SUCCESSFULLY ########");

        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();

            System.out.println("######### USER DETAILS NOT ADDED DUE TO SOME ERROR ########");
        }*/
        //-----------------------SELECT OPERATION -----------------------------------
        User user = session.get(User.class, 1l);
        if (user != null) {
            System.out.println(user);
        } else System.out.println("USER NOT FOUND");

        User user2 = session.get(User.class, 22l);
        if (user2 != null) {
            System.out.println(user2);
        } else System.out.println("USER NOT FOUND");
        //-----------------------UPDATE OPERATION------------------------------------
        /*try {
            User user = session.get(User.class, 3L);
            user.setName("Priya");
            user.setEmail("priya@Gmail.com");
            user.setPassword("pr1234");
            user.setGender("female");
            user.setCity("banglore");
            session.saveOrUpdate(user);
            transaction.commit();

            System.out.println("######### USER DETAILS UPDATED SUCCESSFULLY ########");

        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();

            System.out.println("######### USER DETAILS NOT UPDATED DUE TO SOME ERROR ########");
        }*/
        //-----------------------DELETE OPERATION------------------------------------
        /*try {
            User user = new User();
            user.setId(3l);

            session.delete(user);
            transaction.commit();

            System.out.println("######### USER DELETED SUCCESSFULLY ########");

        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();

            System.out.println("######### USER NOT DELETED DUE TO SOME ERROR ########");
        }*/
    }
}
