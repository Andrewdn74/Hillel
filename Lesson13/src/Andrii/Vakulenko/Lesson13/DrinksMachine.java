package Andrii.Vakulenko.Lesson13;
public enum DrinksMachine {
    COFFEE("кофе арабика"),
    TEA("пакетик чая липтон"),
    LEMONADE("классический лимонадный сироп"),
    MOJITO("сироп мохито"),
    MINERAL_WATER("минеральной воды моршинская "),
    COCA_COLA("диетической Кока Колы");
    private final String description;

    DrinksMachine(String description) {
        this.description = description;
    }
    public String getDescription(){
        return this.description;
    }
}
