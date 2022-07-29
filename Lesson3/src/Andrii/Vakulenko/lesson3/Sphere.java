package Andrii.Vakulenko.lesson3;

public class Sphere {
    static  class Globe {
        double radius;
        double density;
        double weight;
        Globe(double radius, double density) {
            this.radius = radius;
            this.density = density;
            this.weight = Math.ceil(4.0/3.0* 3.14 * Math.pow(this.radius, 3) * this.density * 1000) / 1000;
        }
    }
    public static void main(String[] args) {
        Globe one = new Globe(1,0.7);
        Globe two = new Globe(0.5,0.7);
        Globe three = new Globe(0.2,0.7);
        double snowmanMass = one.weight + two.weight + three.weight;
        System.out.println("The snowman's mass is " + snowmanMass + " kg");
    }
}
