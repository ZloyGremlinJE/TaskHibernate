package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
       UserService service = new UserServiceImpl();
        service.dropUsersTable();
        service.createUsersTable();


        service.saveUser("Вася", "Пупкинг", (byte) 25);
        Util.getFactory().close();
//        service.saveUser("Коля", "Декстер", (byte) 21);
//        service.saveUser("Элтон", "Пресли", (byte) 29);
//        service.saveUser("Обама", "Трамп", (byte) 23);
//
//        List<User> list = service.getAllUsers();
//        System.out.println(list);
//        service.removeUserById(1);
//        service.cleanUsersTable();
//        service.dropUsersTable();


//        Session session = Util.getSession();
//        String CREATE_TABLE = "CREATE TABLE if not exists users " +
//                "(id BIGINT not NULL  AUTO_INCREMENT," +
//                " name VARCHAR(70), " +
//                " lastName VARCHAR(70), " +
//                " age TINYINT, " +
//                " PRIMARY KEY ( id ))";
//
//
//        session.beginTransaction();
//        session.createSQLQuery(CREATE_TABLE).executeUpdate();
//        session.getTransaction().commit();
       // session.getSessionFactory().close();
//            User user = new User("Вася", "Пупкинг", (byte) 25);
//            session.beginTransaction();
//            session.save(user);
//            session.getTransaction().commit();
        }
}

