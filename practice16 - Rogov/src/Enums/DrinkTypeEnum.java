package Enums;

public enum DrinkTypeEnum {
    BEER ("Пиво"),
    WINE ("Вино"),
    VODKA ("Водка"),
    BRANDY ("Бренди"),
    CHAMPAGNE("Шампанское"),
    WHISKEY("Виски"),
    TEQUILA("Тэкила"),
    RUM("Ром"),
    VERMUTH("Вермут"),
    LIQUOR("Ликер"),
    JAGERMEISTER("Без понятия что это"),
    JUICE("Сок"),
    COFFE("Кофе"),
    GREEN_TEA("Зеленый чай"),
    BLACK_TEA("Черный чай"),
    MILK("Молоко"),
    WATER("Вода"),
    SODA("Газировка");


    private String title;


    DrinkTypeEnum(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}
