package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserService service = new UserServiceImpl();
        service.createUsersTable();
        service.saveUser("Вася", "Пупкинг", (byte) 25);
        service.saveUser("Коля", "Обамыч", (byte) 77);
        service.saveUser("Донателло", "Трампыч", (byte) 70);
        service.saveUser("Джо", "Ака Байден", (byte) 70);
        service.removeUserById(1);
        System.out.println(service.getAllUsers());
        service.dropUsersTable();
        Util.getFactory().close();
    }
}

