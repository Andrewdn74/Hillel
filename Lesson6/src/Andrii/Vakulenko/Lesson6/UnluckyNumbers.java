package Andrii.Vakulenko.Lesson6;
public class UnluckyNumbers {
    public static void main (String[] args){
        String string = new String("The lucky  space ships numbers are: ");
        for (int i = 1, k=1; k <= 100; i++){
            if (!doesNumberHasDigits(i, 4, 9 )){
                String s = Integer.toString(i);
                if (k < 100) {
                    string += s + ", ";
                }else {string += s + ".";}
                k++;
            }
        }
        System.out.println(string);
    }
    static boolean doesNumberHasDigits(int number, int digitOne, int digitTwo){
        char charOne = (char)(digitOne + '0');
        char charTwo = (char)(digitTwo + '0');
        String s = Integer.toString(number);
        char [] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++){
            if(chars[i] == charOne || chars[i] == charTwo){
               return true;
            }
        }
        return false;
    }
}
