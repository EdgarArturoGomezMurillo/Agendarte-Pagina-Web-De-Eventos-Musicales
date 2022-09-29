package edu.grupo05.agendarte.controller;

import edu.grupo05.agendarte.entity.User;
import edu.grupo05.agendarte.service.UserService;
import java.util.List;
import javax.validation.Valid;

// Importing required classes
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// Annotation
@RestController
public class UserController {

    // Annotation
    @Autowired private UserService userService;

    // Save operation
    @PostMapping("/users")
    public User saveUser(
            @Valid @RequestBody User user)
    {
        return userService.saveUser(user);
    }

    // Read operation
    @GetMapping("/users")
    public List<User> fetchUserList()
    {
        return userService.fetchUserList();
    }

    // Update operation
    @PutMapping("/users/{id}")
    public User
    updateUser(@RequestBody User user,
                     @PathVariable("id") Long userId)
    {
        return userService.updateUser(
                user, userId);
    }

    // Delete operation
    @DeleteMapping("/users/{id}")
    public String deleteUsersById(@PathVariable("id")
                                       Long userId)
    {
        userService.deleteUserById(
                userId);
        return "Deleted Successfully";
    }
}
