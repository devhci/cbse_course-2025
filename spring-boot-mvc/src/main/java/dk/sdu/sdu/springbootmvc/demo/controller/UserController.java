package dk.sdu.sdu.springbootmvc.demo.controller;

import dk.sdu.sdu.springbootmvc.demo.entity.User;
import dk.sdu.sdu.springbootmvc.demo.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST Controller for managing Users.
 */
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    // Constructor-based Dependency Injection
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Get all users
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Add a new user
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}
