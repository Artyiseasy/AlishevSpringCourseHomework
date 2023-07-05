package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;



@Component
public class RockMusic implements Music {
    private List<String> songs = new ArrayList<>();
    {
        songs.add("rockSong1");
        songs.add("rockSong2");
        songs.add("rockSong3");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
