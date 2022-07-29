package Andrii.Vakulenko.Lesson10.Cars;
public class Lorry extends Car {
    int loadCapacity;
    public Lorry(String carBrand, String carClass, int carWeight, String driverName, int drivingExperience, int power,
                 String manufacture, int loadCapacity) {
        super(carBrand, carClass, carWeight, driverName, drivingExperience, power, manufacture);
        this.loadCapacity = loadCapacity;
    }
}
