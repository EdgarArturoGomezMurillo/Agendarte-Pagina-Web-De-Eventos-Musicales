package edu.grupo05.agendarte.controller;

import edu.grupo05.agendarte.entity.Music;
import edu.grupo05.agendarte.service.MusicService;
import java.util.List;
import javax.validation.Valid;

// Importing required classes
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// Annotation
@RestController
public class MusicController {


    // Annotation
    @Autowired private MusicService musicService;

    // Save operation
    @PostMapping("/musics")
    public Music saveMusic(
            @Valid @RequestBody Music music)
    {
        return musicService.saveMusic(music);
    }

    // Read operation
    @GetMapping("/musics")
    public List<Music> fetchMusicList()
    {
        return musicService.fetchMusicList();
    }

    // Update operation
    @PutMapping("/musics/{id}")
    public Music
    updateMusic(@RequestBody Music music,
                @PathVariable("id") Long musicId)
    {
        return musicService.updateMusic(
                music, musicId);
    }

    // Delete operation
    @DeleteMapping("/musics/{id}")
    public String deleteMusicsById(@PathVariable("id")
                                  Long musicId)
    {
        musicService.deleteMusicById(
                musicId);
        return "Deleted Successfully";
    }
}
