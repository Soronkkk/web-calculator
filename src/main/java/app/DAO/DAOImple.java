package app.DAO;

import app.entities.*;
import app.util.*;

import org.hibernate.Query;
import org.hibernate.Session;

import javax.jws.soap.SOAPBinding;
import java.util.List;
import java.util.Queue;

public class DAOImple {

    public void saveUser(UsersEntity usersEntity){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(usersEntity);
        session.getTransaction().commit();
        session.close();
    }

    public List<UsersEntity> getAll(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<UsersEntity> list = session.createQuery("from UsersEntity ").list();
        session.getTransaction().commit();
        session.close();
        return list;
    }

    public void update(UsersEntity usersEntity){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(usersEntity);
        session.getTransaction().commit();
        session.close();
    }

    public UsersEntity getUserById(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from UsersEntity  where id=:id");
        query.setInteger("id", id);
        UsersEntity usersEntity = (UsersEntity) query.uniqueResult();
        session.getTransaction().commit();
        session.close();
        return usersEntity;
    }

    public void deleteUser(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from UsersEntity where id=:id");
        query.setInteger("id", id);
        UsersEntity usersEntity = (UsersEntity) query.uniqueResult();
        session.delete(usersEntity);
        session.getTransaction().commit();
        session.close();
    }

}
