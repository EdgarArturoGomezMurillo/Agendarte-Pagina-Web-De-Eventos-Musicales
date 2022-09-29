package edu.grupo05.agendarte.service;

import edu.grupo05.agendarte.entity.User;
import edu.grupo05.agendarte.repository.UserRepository;

// Importing required classes
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Annotation
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    // Save operation
    @Override
    public User saveUser(User user)
    {
        return userRepository.save(user);
    }

    // Read operation
    @Override public List<User> fetchUserList()
    {
        return (List<User>)
                userRepository.findAll();
    }

    // Update operation
    @Override
    public User
    updateUser(User user,
                     Long userId)
    {
        User usuarioDB
                = userRepository.findById(userId)
                .get();

        if (Objects.nonNull(user.getUserCedula())
                && !"".equalsIgnoreCase(
                user.getUserCedula())) {
            usuarioDB.setUserCedula(
                    user.getUserCedula());
        }

        if (Objects.nonNull(user.getUserName())
                && !"".equalsIgnoreCase(
                user.getUserName())) {
            usuarioDB.setUserName(
                    user.getUserName());
        }

        if (Objects.nonNull(user.getUserLastName())
                && !"".equalsIgnoreCase(
                user.getUserLastName())) {
            usuarioDB.setUserLastName(
                    user.getUserLastName());
        }

        if (Objects.nonNull(user.getUserAddress())
                && !"".equalsIgnoreCase(
                user.getUserAddress())) {
            usuarioDB.setUserAddress(
                    user.getUserAddress());
        }

        if (Objects.nonNull(user.getUserTelephone())
                && !"".equalsIgnoreCase(
                user.getUserTelephone())) {
            usuarioDB.setUserTelephone(
                    user.getUserTelephone());
        }

        if (Objects.nonNull(user.getUserMail())
                && !"".equalsIgnoreCase(
                user.getUserMail())) {
            usuarioDB.setUserMail(
                    user.getUserMail());
        }

        if (Objects.nonNull(user.getUserGender())
                && !"".equalsIgnoreCase(
                user.getUserGender())) {
            usuarioDB.setUserGender(
                    user.getUserGender());
        }

        return userRepository.save(usuarioDB);

    }

    // Delete operation
    @Override
    public void deleteUserById(Long userId)
    {
        userRepository.deleteById(userId);
    }
}
