package Andrii.Vakulenko.Lesson6;
import java.util.Scanner;
public class Factorial {
    public static void main (String[] args){
        System.out.println("Please enter the number from 2 to 8 for computing factorial:");
        int number = getDigit();
        int result = getFactorial(number);
        System.out.println("The " + number + " factorial = " + result);
    }
    static int getDigit (){
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();
        while (digit < 2 || digit > 8){
            System.out.println("You are wrong. Please enter the number from 2 to 8");
            digit = scanner.nextInt();
        }
        System.out.println("You entered number: " + digit);
        return digit;
    }
    static int getFactorial(int number){
        int factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
