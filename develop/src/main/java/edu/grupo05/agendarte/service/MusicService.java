package edu.grupo05.agendarte.service;

import edu.grupo05.agendarte.entity.Music;

// Importing required classes
import java.util.List;


public interface MusicService {
    // Save operation
    Music saveMusic(Music music);

    // Read operation
    List<Music> fetchMusicList();

    // Update operation
    Music updateMusic(Music music, Long musicId);

    // Delete operation
    void deleteMusicById(Long musicId);
}
