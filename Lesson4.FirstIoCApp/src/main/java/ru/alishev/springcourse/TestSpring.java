package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic(GenreOfMusic.ROCKMUSIC);
        musicPlayer.playMusic(GenreOfMusic.CLASSICALMUSIC);
        context.close();
    }
}
