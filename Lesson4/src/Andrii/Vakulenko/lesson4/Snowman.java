package Andrii.Vakulenko.lesson4;
public class Snowman {
    static  class Globe {
        double radius;
        Globe(double radius) {
            this.radius = radius;
        }
        double volumeSphere(double radius){
            return Math.ceil(4.0/3.0* 3.14 * Math.pow(this.radius, 3) * 1000) / 1000;
        }
    }
    public static void main(String[] args) {
        Globe one = new Globe(1.0);
        Globe two = new Globe(0.5);
        Globe three = new Globe(0.2);
        System.out.println("The first sphere's volume is " + one.volumeSphere(1.0) + " m^3");
        System.out.println("The second sphere's volume is " + two.volumeSphere(0.5) + " m^3");
        System.out.println("The third sphere's volume is " + three.volumeSphere(0.2) + " m^3");
    }
}
