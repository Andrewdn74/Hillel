package Andrii.Vakulenko.Lesson6;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[10];
        String str = "";
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandom(-20, 20);

            if (i < (array.length - 1)) {
                str += array[i] + ",";
            } else {
                str += array[i] + ".";
                System.out.println(str);
            }
        }
    }
    static int getRandom(int start, int end) {

        return (int) (Math.random() * (end - start + 1)) + start;
    }
}