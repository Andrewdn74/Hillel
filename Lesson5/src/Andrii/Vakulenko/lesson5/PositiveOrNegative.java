package Andrii.Vakulenko.lesson5;
public class PositiveOrNegative {
    public static void main (String[] args) {
        int number = getRandom(-1000, 1000);
        System.out.println(number + isPositiveOrNegative(number));
    }
        static String isPositiveOrNegative(int random){
            if (random == 0) {
               return  " is zero.";
            }
            else if (random > 0) {
                    return " is positive.";
            }
                else {
                    return " is negative.";
            }
        }
        static int getRandom(int start, int end){
            return (int) (Math.random() * (end - start + 1)) + start;
        }
}
