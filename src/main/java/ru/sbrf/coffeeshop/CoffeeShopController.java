package ru.sbrf.coffeeshop;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/coffeeshop/registration/")
public class CoffeeShopController {

    @PostMapping
    public User userRegistration(@RequestParam String login, @RequestParam String password) {
        User user = new User(login, password);
        BD.addUser(user);
        return user;
    }

}
