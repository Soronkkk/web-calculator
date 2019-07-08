package app;

import app.DAO.DAOImplementation;
import app.entities.ResultsEntity;

import java.util.UUID;

public class main {
    public static void main(String[] args) {
        DAOImplementation daoImple = new DAOImplementation();
/*            UsersEntity usersEntity = new UsersEntity();
            usersEntity.setId((long) 12);
            usersEntity.setUserName("rew");
            usersEntity.setPassword("fdsf");
            usersEntity.setFirstName("fdsf");
            usersEntity.setSecondName("fgfgsd");
            daoImple.saveUser(usersEntity);
            daoImple.deleteUser(1);*/
  System.out.println(daoImple.getUserById(291).getCookie());
        ResultsEntity resultsEntity = new ResultsEntity();
        resultsEntity.setResult("0");
        resultsEntity.setOperation("0");
        resultsEntity.setId((long) 1);
        resultsEntity.setCookie(UUID.fromString("ce6981aa-4033-4df9-b9c1-3d7257e99636"));
        daoImple.save(resultsEntity);
    }
}
