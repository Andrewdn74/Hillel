package Andrii.Vakulenko.lesson5;

public class Triangle {
    public  static  void main(String[] args){
        int sideA = PositiveOrNegative.getRandom(5, 20);
        int sideB = PositiveOrNegative.getRandom(5, 20);
        int sideC = PositiveOrNegative.getRandom(5, 20);
        System.out.println("The triangle with side A=" + sideA + ", side B=" + sideB + ", side C=" + sideC + " is " +
                isValidTriangle( sideA, sideB, sideC) );
    }
    static String isValidTriangle(int sideA, int sideB, int sideC){
        if (((sideA + sideB) > sideC) && ((sideB + sideC) > sideA) && ((sideA + sideC) > sideB)){
            return "valid.";
        }else {
            return "invalid.";
        }
    }
}
