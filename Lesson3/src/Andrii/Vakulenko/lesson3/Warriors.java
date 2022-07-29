package Andrii.Vakulenko.lesson3;

public class Warriors {
    static  class Dynasty {
        int warriors;
        int archer;
        int rider;
        int quantity;
        int attackPower;
        Dynasty(int warriors, int archer, int rider,int quantity) {
            this.warriors = warriors;
            this.archer = archer;
            this.rider = rider;
            this.quantity = quantity;
            this.attackPower= (this.archer + this.warriors + this.rider) * this.quantity;

        }
    }
    public static void main(String[] args) {
            Dynasty Lee = new Dynasty(13 , 24,46,860);
            Dynasty Meen = new Dynasty (9, 35, 12, (int) (860 * 1.5));
            System.out.println("The attack power of Lee's dynasty is " + Lee.attackPower);
            System.out.println("The attack power of Meen's dynasty is " + Meen.attackPower);
    }
}
