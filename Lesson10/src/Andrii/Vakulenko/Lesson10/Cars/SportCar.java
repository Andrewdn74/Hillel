package Andrii.Vakulenko.Lesson10.Cars;
public class SportCar extends Car {
    int speedLimit;
    public SportCar(String carBrand, String carClass, int carWeight, String driverName, int drivingExperience, int power,
                    String manufacturer, int speedLimit) {
        super(carBrand, carClass, carWeight, driverName, drivingExperience, power, manufacturer);
        this.speedLimit = speedLimit;
    }
}