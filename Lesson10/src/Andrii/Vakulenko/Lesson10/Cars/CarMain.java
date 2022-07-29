package Andrii.Vakulenko.Lesson10.Cars;

public class CarMain {
    public static void main(String[] args) {
        Lorry lorry = new Lorry("Renault T440", "грузовой тягач", 4000, "Шевченко Андрей Сергеевич", 10,
                440, "Renault", 18);
        SportCar sportCar = new SportCar("Lexus LC500", " спортивный кабриолет ", 2375, "Коваленко Петр Алексеевич", 15,
                477 ,"Toyota", 270);
        Car russianAutoTrash = new Car("Lada Granta", "оркомобиль", 800, "Мертвый Владимир Владимирович",
                50, 82, "ВАЗ" );
        System.out.println("Автомобиль " + lorry.carBrand + ", класса " + lorry.carClass + ", весом " + lorry.carWeight + " кг," +
                " мощностью двигателя " + lorry.engine.power + " лс, произведенного компанией " + lorry.engine.manufacturer +
                ", грузоподъемностью " + lorry.loadCapacity + " тонн,\n управляет " + lorry.driver.driverName +
                ", со стажем вождения " + lorry.driver.drivingExperience + " лет.");
        System.out.println("Автомобиль " + sportCar.carBrand + ", класса " + sportCar.carClass + ", весом " + sportCar.carWeight + " кг," +
                " мощностью двигателя " + sportCar.engine.power + " лс, произведенного компанией " + sportCar.engine.manufacturer +
                ", с максимально допустимой скоростью " + sportCar.speedLimit + " км/ч,\n управляет " + sportCar.driver.driverName +
                ", со стажем вождения " + sportCar.driver.drivingExperience + " лет.");
        System.out.println("Во время прохождения показательного тест драйва беспилотный российский");
        russianAutoTrash.carInfo();
        System.out.println("сначала выполнил команду: " + russianAutoTrash.start() + ", затем команду: " + russianAutoTrash.turnLeft()
                + ", и уже после команды: " + russianAutoTrash.turnRight() + ", не смог выполнить команду:" + russianAutoTrash.stop()
                + "\n и врезался в забор предприятия авто ВАЗ.");


    }

}
