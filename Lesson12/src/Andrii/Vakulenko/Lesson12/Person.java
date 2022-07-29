package Andrii.Vakulenko.Lesson12;
public class Person implements Comparable<Person> {
   private String name;
   private String surName;
   private int age;
   private String sex;
   public Person(String name, String surName, int age, String sex) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.sex = sex;
    }
    public String getName() {
        return name;
    }
    public String getSurName() {
        return surName;
    }
    public int getAge() {
        return age;
    }
    public String getSex() {
        return sex;
    }
    @Override
    public String toString() {
        return String.format("\n{Имя: %s, Фамилия: %s, Возраст: %s, Пол: %s}", this.name, this.surName, this.age, this.sex);
    }
    @Override
    public int compareTo(Person person) {
        return Integer.compare(this.age, person.getAge());
    }
}
