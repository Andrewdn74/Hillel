package Andrii.Vakulenko.Lesson9;
import java.util.Arrays;
public class RepeatingNumbers {
    public static void main(String[] args) {
     int [] array = new int [10000];
     int [] result = new int [101];
     int countAll = 0;
     int value;
        for (int i = 0; i < array.length; i++) {
            value = getRandom(0,100);
            array[i] = value;
            result[value] ++;
        }
        String str = "";
        for (int i = 0; i < result.length; i++) {
            if(result[i] > 2){
                countAll ++;
                str += "{" + i + ":" + result[i] + "}";
            }
        }
        System.out.println("Колличество цифр от 0 до 100, повторяющееся больше 2-х раз в произвольном массиве из 10 тыс элементов равно " + countAll +".");
        System.out.println("Вывод в формате {цифра : количество повторений}");
        System.out.println(str);
    }
    static int getRandom(int start, int end) {
        return (int) (Math.random() * (end - start + 1)) + start;
    }
}
