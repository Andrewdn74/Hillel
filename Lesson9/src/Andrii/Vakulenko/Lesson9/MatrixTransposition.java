package Andrii.Vakulenko.Lesson9;

import java.util.Arrays;

public class MatrixTransposition {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int [][] original = new int [m][n];
        int [][] transported = new int [n][m];
        int random;
        System.out.println("Оригинальная матрица " + m + "*" + n + ":");
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n; j++) {
                random = getRandom(0,9);
                original [i][j] = random;
                transported [j][i] = random;
            }
            System.out.println(Arrays.toString(original[i]));
        }
        System.out.println("Транспонированная матрица " + n + "*" + m + ":");
        for (int i = 0; i < n ; i++) {
            System.out.println(Arrays.toString(transported[i]));
        }
    }
    static int getRandom(int start, int end) {
        return (int) (Math.random() * (end - start + 1)) + start;
    }
}
