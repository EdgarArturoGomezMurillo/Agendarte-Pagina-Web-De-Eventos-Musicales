package edu.grupo05.agendarte.controller;

import edu.grupo05.agendarte.entity.User;
import edu.grupo05.agendarte.repository.UserRepository;
import edu.grupo05.agendarte.service.UserService;
import java.util.List;
import javax.validation.Valid;

// Importing required classes
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;


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




//
//@Controller
//@RequestMapping("/users/")
//public class UserController {
//
//    private final UserRepository userRepository;
//
//    @Autowired
//    public UserController(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    @GetMapping("signup")
//    public String showSignUpForm(User user) {
//        return "add-user";
//    }
//
//    @GetMapping("list")
//    public String showUpdateForm(Model model) {
//        model.addAttribute("users", userRepository.findAll());
//        return "index";
//    }
//
//    @PostMapping("add")
//    public String addUser(@Valid User user, BindingResult result, Model model) {
//        if (result.hasErrors()) {
//            return "add-student";
//        }
//
//       userRepository.save(user);
//        return "redirect:list";
//    }
//
//    @GetMapping("edit/{id}")
//    public String showUpdateForm(@PathVariable("id") long id, Model model) {
//        User user = userRepository.findById(id)
//                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
//        model.addAttribute("user", user);
//        return "update-user";
//    }
//
//    @PostMapping("update/{id}")
//    public String updateUser(@PathVariable("id") long id, @Valid User user, BindingResult result,
//                                Model model) {
//        if (result.hasErrors()) {
//            user.setUserId(id);
//            return "update-user";
//        }
//
//        userRepository.save(user);
//        model.addAttribute("users", userRepository.findAll());
//        return "index";
//    }
//
//    @GetMapping("delete/{id}")
//    public String deleteUser(@PathVariable("id") long id, Model model) {
//        User user = userRepository.findById(id)
//                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
//        userRepository.delete(user);
//        model.addAttribute("users", userRepository.findAll());
//        return "index";
//    }
//}