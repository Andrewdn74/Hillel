package Andrii.Vakulenko.Lesson13;
public class Drinks {
    public static final int COFFEE_PRICE = 20;
    public static final int TEA_PRICE = 10;
    public static final int LEMONADE_PRICE = 25;
    public static final int MOJITO_PRICE = 30;
    public static final int MINERAL_WATER_Price = 10;
    public static final int COCA_COLA_PRICE = 15;
    public int volume;

    public Drinks(int volume) {
        this.volume = volume;
    }
    public void makeDrinks(String drink, String  description){
        String str;
        if ( drink == "COFFEE" || drink == "TEA"){
            System.out.println("Мы взяли " + description + " и добавили " + this.volume + " мл горячей воды.");
        }else if (drink == "LEMONADE" || drink == "MOJITO") {
            System.out.println("Мы взяли " + description + " и добавили " + this.volume + " мл холодной воды.");
        }else System.out.println(str = "Мы взяли " + this.volume + " мл " + description +".");
    }
}
