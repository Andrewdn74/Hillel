package Andrii.Vakulenko.Lesson12;
public class RockMusic extends MusicStyles{
    @Override
    public void playMusic() {
        System.out.println("We play rock music!\n"); ;
    }
    @Override
    public String toString() {
        return "RockMusic band:";
    }
}
