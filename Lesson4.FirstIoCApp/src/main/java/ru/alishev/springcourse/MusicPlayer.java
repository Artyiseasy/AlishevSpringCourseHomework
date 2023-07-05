package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.Random;


@Component
public class MusicPlayer {

    private RockMusic rockMusic ;
    private ClassicalMusic classicalMusic;

    @Autowired
    public MusicPlayer(RockMusic rockMusic, ClassicalMusic classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }

    public void playMusic(GenreOfMusic genre) {
    Random rnd = new Random();
    int initrandom = rnd.nextInt(3);

    if(genre == GenreOfMusic.ROCKMUSIC){
        System.out.println(rockMusic.getSong().get(initrandom));
    }
    else{
        System.out.printf(classicalMusic.getSong().get(initrandom));
    }

    }
}
