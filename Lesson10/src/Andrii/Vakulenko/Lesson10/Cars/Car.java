package Andrii.Vakulenko.Lesson10.Cars;
public class Car {
    String carBrand;
    String carClass;
    int carWeight;
    Driver driver;
    Engine engine;
    public Car(String carBrand, String carClass, int carWeight, String driverName, int drivingExperience, int power, String manufacturer) {
        this.carBrand = carBrand;
        this.carClass = carClass;
        this.carWeight = carWeight;
        this.driver = new Driver(driverName, drivingExperience);
        this.engine = new Engine(power, manufacturer);
    }
    public String start(){
//        System.out.println("Поехали");
        return "Поехали";
    }
    public String stop(){
//        System.out.println("Останавливаемся");
        return "Останавливаемся";
    }
    public String turnRight() {
//        System.out.println("Поворот направо");
        return "Поворот направо";
    }
    public String turnLeft(){
//        System.out.println("Поворот налево");
        return "Поворот налево";
    }
    public void carInfo(){
        System.out.println("автомобиль марки " + this.carBrand + ", класса " + this.carClass + ", весом  " + this.carWeight
                + "кг, с двигателем мощностью " + this.engine.power + " лс и произведенный " + this.engine.manufacturer +
                ", управлял которым дистанционно " + this.driver.driverName + ",\n со стажем вождения " + this.driver.drivingExperience + " лет,");
    }
}
