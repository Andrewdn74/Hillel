package Andrii.Vakulenko.Lesson11;
public class UserAccountMain {
    public static void main(String[] args) {
        int currentYear = 2022;
        UserAccount nameShechenko = new UserAccount("Андрей", 15, 1, 1992, "shevcenko@gmail.com",
                "+380995005050","Шевченко", 90, "120/80", 20000, currentYear );
        nameShechenko.printAccountInfo();
        UserAccount nameArtemenko = new UserAccount("Генадий", 7, 7, 2002, "artemenko@gmail.com",
                "+380665005050","Артеменко", 100, "110/90", 15000, currentYear);
        nameArtemenko.printAccountInfo();
        UserAccount nameVelichenko = new UserAccount("Сергей", 10, 10, 1997, "velichenko@gmail.com",
                "+380505005050","Величенко", 80, "125/80", 10000, currentYear);
        nameVelichenko.printAccountInfo();
        nameArtemenko.setPressure("130/80");
        nameShechenko.setStepQuantity(25200);
        nameArtemenko.printAccountInfo();
        nameShechenko.printAccountInfo();
    }
}
