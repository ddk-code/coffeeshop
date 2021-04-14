package ru.sbrf.coffeeshop;

import java.util.ArrayList;

public class BD {
    private static int id;
    final private static ArrayList<User> users = new ArrayList<>();

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
        for (User user : users) {
            if (user.getLogin().equals(login)) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList<User> getUsers() {
        return users;
    }
}
