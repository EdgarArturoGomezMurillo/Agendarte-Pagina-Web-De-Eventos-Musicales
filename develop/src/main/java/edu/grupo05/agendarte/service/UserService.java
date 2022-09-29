package edu.grupo05.agendarte.service;

import edu.grupo05.agendarte.entity.User;


// Importing required classes
import java.util.List;

public interface UserService {
    // Save operation
    User saveUser(User user);

    // Read operation
    List<User> fetchUserList();

    // Update operation
    User updateUser(User user, Long userId);

    // Delete operation
    void deleteUserById(Long userId);
}
