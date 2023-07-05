package ru.alishev.springcourse;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;



@Component
public class ClassicalMusic implements Music {
    private List<String> songs = new ArrayList<>();
    {
        songs.add("classicalSong1");
        songs.add("classicalSong2");
        songs.add("classicalSong3");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
