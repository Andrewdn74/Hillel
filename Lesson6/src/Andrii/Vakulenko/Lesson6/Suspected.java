package Andrii.Vakulenko.Lesson6;
public class Suspected {
    public static void main(String[] args) {
        int[] suspects = new int[20];
        String str="";
        for (int i = 0; i < suspects.length; i++) {
            suspects[i] = getRandom(0, 100);
            str += suspects[i] + ",";
        }
        int [] result = getMaximum(suspects);
        System.out.println("Массив вероятностей подозреваемых: " + str);
        System.out.println("Наиболее вероятный подозреваемый номер:" + result[1] + ".");
        System.out.println("Его вероятность совершения преступления:" + result[0] + ".");
    }
    static int getRandom(int start, int end) {
        return (int) (Math.random() * (end - start + 1)) + start;
    }
    static int [] getMaximum(int [] array) {
        int max = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {max= array[i];
            index = i;
            }
        }
        int [] result ={max, index};
    return  result;
    }
}
