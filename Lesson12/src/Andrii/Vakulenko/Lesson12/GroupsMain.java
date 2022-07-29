package Andrii.Vakulenko.Lesson12;

import java.util.Arrays;

public class GroupsMain {
    public static void main(String[] args) {
        MusicStyles [] musicGroups = new MusicStyles[3];
        musicGroups[0] = new PopMusic();
        musicGroups[1] = new RockMusic();
        musicGroups[2] = new ClassicMusic();
        for (MusicStyles musicStyle: musicGroups) {
            System.out.println(musicStyle);
            musicStyle.playMusic();
        }
    }
}
