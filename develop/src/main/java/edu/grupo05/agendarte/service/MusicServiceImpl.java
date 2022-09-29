package edu.grupo05.agendarte.service;

import edu.grupo05.agendarte.entity.Music;
import edu.grupo05.agendarte.repository.MusicRepository;


// Importing required classes
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Annotation
@Service
public class MusicServiceImpl implements MusicService {

    @Autowired
    private MusicRepository musicRepository;

    // Save operation
    @Override
    public Music saveMusic(Music music)
    {
        return musicRepository.save(music);
    }

    // Read operation
    @Override public List<Music> fetchMusicList()
    {
        return (List<Music>)
                musicRepository.findAll();
    }

    // Update operation
    @Override
    public Music
    updateMusic(Music music,
                Long musicId)
    {
        Music musicaDB
                = musicRepository.findById(musicId)
                .get();

        if (Objects.nonNull(music.getMusicTitle())
                && !"".equalsIgnoreCase(
                music.getMusicTitle())) {
            musicaDB.setMusicTitle(
                    music.getMusicTitle());
        }

        if (Objects.nonNull(music.getMusicGenre())
                && !"".equalsIgnoreCase(
                music.getMusicGenre())) {
            musicaDB.setMusicGenre(
                    music.getMusicGenre());
        }

        if (Objects.nonNull(music.getMusicAuthor())
                && !"".equalsIgnoreCase(
                music.getMusicAuthor())) {
            musicaDB.setMusicAuthor(
                    music.getMusicAuthor());
        }

        if (Objects.nonNull(music.getMusicDuration())
                && !"".equalsIgnoreCase(
                music.getMusicDuration())) {
            musicaDB.setMusicDuration(
                    music.getMusicDuration());
        }


        return musicRepository.save(musicaDB);

    }

    // Delete operation
    @Override
    public void deleteMusicById(Long musicId)
    {
        musicRepository.deleteById(musicId);
    }
}
