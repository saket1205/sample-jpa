package com.db.sample.Controller;

import com.db.sample.Repository.UserRepository;
import com.db.sample.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/get/{userId}")
    public Optional<User> getName(@PathVariable Long userId)
    {
        return userRepository.findById(userId);
    }

    @PostMapping(value = "/addUser")
    public Optional<User> add(@RequestBody final User user)
    {
         userRepository.save(user);
         return userRepository.findById(user.getId());
    }

    @GetMapping(value = "/all")
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

}
