package app;

import app.DAO.DAOImple;
import app.entities.ResultsEntity;
import app.entities.UsersEntity;

import javax.servlet.RequestDispatcher;

public class main {
    public static void main(String[] args) {
        DAOImple daoImple = new DAOImple();
/*            UsersEntity usersEntity = new UsersEntity();
            usersEntity.setId((long) 12);
            usersEntity.setUserName("rew");
            usersEntity.setPassword("fdsf");
            usersEntity.setFirstName("fdsf");
            usersEntity.setSecondName("fgfgsd");
            daoImple.saveUser(usersEntity);
            daoImple.deleteUser(1);*/
        daoImple.deleteUser(1);

    }
}
