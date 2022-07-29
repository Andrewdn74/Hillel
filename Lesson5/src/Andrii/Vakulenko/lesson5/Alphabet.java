package Andrii.Vakulenko.lesson5;

public class Alphabet {
    public static void main (String[] args) {
        char symbol = (char)(Math.random() * (190 - 45 + 1) + 45);
        System.out.println(symbol + isAlphabet(symbol));
    }
    static String isAlphabet(char randomChar){
        String string1 = Character.toString(randomChar).toLowerCase();
        String string2 = string1.toUpperCase();
        if (string1.equals(string2)) {
            return  " is a Symbol.";
        } else {
            return " is Alphabet.";
        }
    }
}
