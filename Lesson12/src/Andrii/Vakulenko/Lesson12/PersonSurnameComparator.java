package Andrii.Vakulenko.Lesson12;
import java.util.Comparator;
public class PersonSurnameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getSurName().compareTo(o2.getSurName());
    }
}