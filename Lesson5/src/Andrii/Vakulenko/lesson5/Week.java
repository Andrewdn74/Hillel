package Andrii.Vakulenko.lesson5;

public class Week {
    public static void main(String[] args) {
        int random = PositiveOrNegative.getRandom(1, 7);
        System.out.println(weekDays(random));
    }

    public static String weekDays(int dayNumber) {
        switch (dayNumber) {
            case 1:
                return "Today is monday";
            case 2:
                return "Today is tuesday";
            case 3:
                return "Today is wednesday";
            case 4:
                return "Today is thursday";
            case 5:
                return "Today is friday";
            case 6:
                return "Today is saturday";
            case 7:
                return "Today is sunday";
            default: return"";
        }
    }
}
