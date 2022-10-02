package edu.grupo05.agendarte.repository;

// Importing required classes
import edu.grupo05.agendarte.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// Annotation
@Repository

public interface UserRepository extends JpaRepository<User, Long> {
//    List<User> findByName(String name);
}

