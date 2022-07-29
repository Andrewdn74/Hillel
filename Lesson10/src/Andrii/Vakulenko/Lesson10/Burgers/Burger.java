package Andrii.Vakulenko.Lesson10.Burgers;
public class Burger {
    String bun;
    String meat;
    String cheese;
    String greens;
    boolean mayonnaise;
    public Burger(String bun, String meat, String cheese, String greens, boolean mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("Состав стандартного бургера: " + this.bun + ", " + this.meat + ", " + this.cheese + ", " + this.greens + ", "
                + (this.mayonnaise ? "mayonnaise" : "") + ".");
    }
    public Burger(boolean mayonnaise) {
        this.bun = "булочка";
        this.meat = "мясо";
        this.cheese = "сыр";
        this.greens = "зелень";
        this.mayonnaise = mayonnaise;
        System.out.println("Состав диетического бургера: " + this.bun + ", " + this.meat + ", " + this.cheese + ", " + this.greens + "."
                + (this.mayonnaise ? "mayonnaise" : ""));
    }
    public Burger(String meat) {
        this.bun = "булочка";
        this.cheese = "сыр";
        this.greens = "зелень";
        this.mayonnaise = true;
        this.meat = meat;
        System.out.println("Состав бургера c двойным мясом: " + this.bun + ", " + this.meat + ", " + this.cheese + ", " + this.greens + ", "
                + (this.mayonnaise ? "mayonnaise" : "") + ".");
    }
}
