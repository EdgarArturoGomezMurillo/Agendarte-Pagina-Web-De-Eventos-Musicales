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

public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long musicId;
    private String musicTitle;
    private String musicGenre;
    private String musicAuthor;
    private String musicDuration;


    // Mapping to the other table
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Event> event;
}
