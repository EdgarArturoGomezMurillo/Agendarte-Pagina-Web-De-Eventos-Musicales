package edu.grupo05.agendarte.entity;

// Importing required classes
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;


// Annotations
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

//// Adding the table name
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
//    @Column(unique=true)
    private String userCedula;
    private String userName;
    private String userLastName;
    private String userAddress;
    private String userTelephone;
    private String userMail;
    private String userGender;


    // Mapping to the other table
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Event> event;


}
