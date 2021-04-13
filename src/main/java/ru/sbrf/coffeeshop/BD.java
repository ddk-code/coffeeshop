package ru.sbrf.coffeeshop;

import java.util.ArrayList;

public class BD {
    private static int id;
    private static ArrayList<User> users;

    public static String addUser(User user) {
        if (!isUserExist(user.getLogin())) {
            id += 1;
            user.setId(id);
            users.add(user);
            return "User added successfully";
        }
        return "User with this login already exists";
    }

    private static boolean isUserExist(String login) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getLogin().equals(login)) {
                return true;
            }
        }
        return false;
    }
}
