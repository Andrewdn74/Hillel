package Andrii.Vakulenko.Lesson13;
import java.util.Scanner;
public class DrinksMachineMain {
    public static void main(String[] args) {
//        String result ="COCA_COLA";
        int drinksQuantity = 0;
        int price = 0;
        String str = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру для выбора напитка: 1=кофе, 2=чай, 3=лимонад, 4- мохито, 5- минеральная вода" +
                ", 6- Кока Кола, иначе- отмена заказа.\n");
        String string = scanner.nextLine().trim();
        do {
            switch (string) {
                case "1":
                    Drinks coffee = new Drinks(100);
                    coffee.makeDrinks(DrinksMachine.COFFEE.name(), DrinksMachine.COFFEE.getDescription());
                    drinksQuantity++;
                    price += Drinks.COFFEE_PRICE;
                    str += " кофе,";
                    break;
                case "2":
                    Drinks tea = new Drinks(200);
                    tea.makeDrinks(DrinksMachine.TEA.name(), DrinksMachine.TEA.getDescription());
                    drinksQuantity++;
                    price += Drinks.TEA_PRICE;
                    str += " чай,";
                    break;
                case "3":
                    Drinks lemonade = new Drinks(250);
                    lemonade.makeDrinks(DrinksMachine.LEMONADE.name(), DrinksMachine.LEMONADE.getDescription());
                    drinksQuantity++;
                    price += Drinks.LEMONADE_PRICE;
                    str += " лимонад,";
                    break;
                case "4":
                    Drinks mojito = new Drinks(250);
                    mojito.makeDrinks(DrinksMachine.MOJITO.name(), DrinksMachine.MOJITO.getDescription());
                    drinksQuantity++;
                    price += Drinks.MOJITO_PRICE;
                    str += " мохито,";
                    break;
                case "5":
                    Drinks mineralWater = new Drinks(300);
                    mineralWater.makeDrinks(DrinksMachine.MINERAL_WATER.name(), DrinksMachine.MINERAL_WATER.getDescription());
                    drinksQuantity++;
                    price += Drinks.MINERAL_WATER_Price;
                    str += " минеральная вода,";
                    break;
                case "6":
                    Drinks cocaCola = new Drinks(300);
                    cocaCola.makeDrinks(DrinksMachine.COCA_COLA.name(), DrinksMachine.COCA_COLA.getDescription());
                    drinksQuantity++;
                    price += Drinks.COCA_COLA_PRICE;
                    str += " Кока Кола,";
                    break;
                default:
                    System.out.println("Вы закончили заказ.");
                    System.out.println("Вы заказали напитки в колличестве " + drinksQuantity+ " шт:" + str + " на общую стоимость " + price + " грн.");
                    return;
            }
            System.out.println("При желании заказать еще, введите номер напитка: 1=кофе, 2=чай, 3=лимонад, 4- мохито, 5- минеральная" +
                    " вода, 6- Кока Кола, иначе- отмена заказа.\n");
            string = scanner.nextLine().trim();
        } while ("123456".contains(string));
        System.out.println("Вы заказали напитки в колличестве " + drinksQuantity+ " шт:" + str + " на общую стоимость " + price + " грн.");
    }
}
