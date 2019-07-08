package app.DAO;

import app.entities.ResultsEntity;
import app.entities.UsersEntity;
import app.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public  class DAOImplementation {

    public <T> void save(T t){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(t);
        session.getTransaction().commit();
        session.close();
    }

    public static List<UsersEntity> getAll(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List list = session.createQuery("from UsersEntity ").list();
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
