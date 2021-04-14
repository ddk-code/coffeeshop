package ru.sbrf.coffeeshop;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class CoffeeShopController {


    @RequestMapping("/coffeeshop/registration")
    @PostMapping
    public HashMap<String, Object> userRegistration(@RequestParam String login, @RequestParam String password) {
        User user = new User(login, password);
        HashMap<String, Object> hm = new HashMap<>();
        hm.put("status: ", BD.addUser(user));
        hm.put("user: ", user.getId() == 0 ? "User wasn't added" : user);

        return hm;
    }

    @RequestMapping("/coffeeshop/users")
    @GetMapping
    public ArrayList<User> getUsers() {
        return BD.getUsers();
    }


}
