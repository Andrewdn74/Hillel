package Andrii.Vakulenko.Lesson9;
import java.util.Arrays;
public class BorderDefence {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int [][] country = new int [m][m];
        int sum = 0;
        System.out.println("Охрана государства размером " + m + "*" + m + " выглядит так:");
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < m; j++) {
                country [i][j] = getRandom(0,10);
                if (i == 0 || j == 0 || i == m - 1 || j == m - 1){
                    sum += country[i][j];
                }
            }
            System.out.println(Arrays.toString(country[i]));
        }
        System.out.println("Общее число защитников границы: " +sum);
    }
    static int getRandom(int start, int end) {
        return (int) (Math.random() * (end - start + 1)) + start;
    }
}
