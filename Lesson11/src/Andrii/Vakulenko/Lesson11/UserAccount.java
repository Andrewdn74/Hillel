package Andrii.Vakulenko.Lesson11;
public class UserAccount {
    private String name;
    private int dateOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private String email;
    private String telNumber;
    private String surname;
    private int weight;
    private String pressure;
    private int stepQuantity;
    private int currentYear;
    private int age;
    public UserAccount(String name, int dateOfBirth, int monthOfBirth, int yearOfBirth, String email, String telNumber,
                       String surname, int weight, String pressure, int stepQuantity, int currentYear) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
        this.telNumber = telNumber;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.stepQuantity = stepQuantity;
        this.currentYear = currentYear;
        this.age = this.currentYear - this.yearOfBirth;
    }
    public String getName() {
        return name;
    }
    public int getDateOfBirth() {
        return dateOfBirth;
    }
    public int getMonthOfBirth() {
        return monthOfBirth;
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public String getEmail() {
        return email;
    }
    public String getTelNumber() {
        return telNumber;
    }
    public String getSurname() {
        return surname;
    }
    public int getWeight() {
        return weight;
    }
    public String getPressure() {
        return pressure;
    }
    public int getStepQuantity() {
        return stepQuantity;
    }
    public int getAge() {
        return age;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setPressure(String pressure) {
        this.pressure = pressure;
    }
    public void setStepQuantity(int stepQuantity) {
        this.stepQuantity = stepQuantity;
    }
    public void printAccountInfo(){
        System.out.println("Пользователь фитнес трекера: " + this.surname + " " + this.name + ", дата рождения " + this.dateOfBirth
        + "." + this.monthOfBirth + "." + this.yearOfBirth + ", возраст " + this.age + " лет, емейл " + this.email + ", телефон " + this.telNumber
        + ", вес которого составляет " + this.weight + "кг,\n кровеное давление " + this.pressure + ", колличество пройденных шагов за день "
        + this.stepQuantity + ".");
    }
}
