package Andrii.Vakulenko.Lesson10.Burgers;
public class BurgerMain {
    public static void main(String[] args) {
        Burger ordinary = new Burger("булочка", "мясо", "сыр", "зелень", true);
        Burger dietary = new Burger(false);
        Burger doubleMeet = new Burger("двойное мясо");
    }
}
