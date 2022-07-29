package Andrii.Vakulenko.Lesson6;
import java.util.Scanner;
public class Guessing {
    public static void main (String[] args) {
        int number = getRandom(0, 10);
        int amount = 5;
        System.out.println("Try to guess a number from 0 to 10.You have " + amount + " trials.");
        Scanner scanner = new Scanner(System.in);
        do {
            int digit = scanner.nextInt();
            System.out.println("You entered number: " + digit);
            if (number != digit ) {
                System.out.println("You are wrong.You have " + (amount - 1) + " more trials.");
                amount --;
            }   else {System.out.println("You are right.The computer guessed number was " + number + ".");
                    return;
                }
        } while (amount > 0);
        System.out.println("The computer guessed number was " + number + ".");
    }
    static int getRandom(int start, int end){

        return (int) (Math.random() * (end - start + 1)) + start;
    }
}

