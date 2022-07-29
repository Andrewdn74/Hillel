package Andrii.Vakulenko.Lesson12;
public class ClassicMusic extends MusicStyles{
    @Override
    public void playMusic() {
        System.out.println("We play classic music!"); ;
    }
    @Override
    public String toString() {
        return "ClassicMusic band:";
    }
}
