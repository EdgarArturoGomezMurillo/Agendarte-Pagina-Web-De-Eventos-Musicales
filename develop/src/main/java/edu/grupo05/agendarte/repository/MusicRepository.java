package edu.grupo05.agendarte.repository;

// Importing required classes
import edu.grupo05.agendarte.entity.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Annotation
@Repository

public interface MusicRepository extends JpaRepository<Music, Long> {
}
