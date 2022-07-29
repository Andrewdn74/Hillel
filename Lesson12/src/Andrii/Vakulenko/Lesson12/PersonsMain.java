package Andrii.Vakulenko.Lesson12;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
public class PersonsMain {
    public static void main(String[] args) {
        Person [] persons = new Person[6];
        persons[0] = new Person("Алена", "Шевченко",25, "Женский");
        persons[1] = new Person("Петр", "Артеменко",20, "Мужской");
        persons[2] = new Person("Сергей", "Кинах",45, "Мужской");
        persons[3] = new Person("Андрей", "Тимошенко",18, "Мужской");
        persons[4] = new Person("Юлия", "Тимошенко",60, "Женский");
        persons[5] = new Person("Ярослав", "Свиридов",54, "Мужской");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру для выбора метода сортировки: 1=по имени, 2=по фамилии, 3=по фамилии и полу. По умолчанию сортировка по возрасту.");
        String str = scanner.nextLine();
        System.out.println(str);
        if (str.equals("1")){
            System.out.println("Вы выбрали сортировку по имени");
            PersonNameComparator personNameComparator = new PersonNameComparator();
            Arrays.sort(persons, personNameComparator);
        } else if (str.equals("2")){
            System.out.println("Вы выбрали сортировку по фамилии");
            PersonSurnameComparator personSurnameNameComparator = new PersonSurnameComparator();
            Arrays.sort(persons, personSurnameNameComparator);
        } else if (str.equals("3")) {
            System.out.println("Вы выбрали сортировку по фамилии и полу");
            PersonSurname_SexComparator personSurnameSexComparator = new PersonSurname_SexComparator();
            Arrays.sort(persons, personSurnameSexComparator);
        }else {
            System.out.println("Вы выбрали сортировку по возрасту");
            Arrays.sort(persons);}
        System.out.println(Arrays.toString(persons));
    }
}
