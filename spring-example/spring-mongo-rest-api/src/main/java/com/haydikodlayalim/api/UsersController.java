package com.haydikodlayalim.api;

import com.haydikodlayalim.entity.User;
import com.haydikodlayalim.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/users/")
public class UsersController {
    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void init() {
        User user = new User();
        user.setName("Muaz");
        user.setSurName("Memiş");
        userRepository.save(user);
    }

    @PostMapping("add")
    public ResponseEntity<User> add(@RequestBody User user) {
        System.out.println(user.getName());
        return ResponseEntity.ok(userRepository.save(user));
    }

    @GetMapping("getAll")
    public ResponseEntity<List<User>> getAll() {
        return ResponseEntity.ok(userRepository.findAll());
    }
}
