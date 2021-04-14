package ru.sbrf.coffeeshop;

import java.util.ArrayList;

public interface UserService {
    ArrayList<User> getUsers();

    User getUserById(int id);
}
