package Andrii.Vakulenko.Lesson12;
import java.util.Comparator;
public class PersonSurname_SexComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int compare= o1.getSurName().compareTo(o2.getSurName());
        if (compare == 0) {
            compare = o1.getSex().compareTo(o2.getSex());
        }
        return compare;
    }
}