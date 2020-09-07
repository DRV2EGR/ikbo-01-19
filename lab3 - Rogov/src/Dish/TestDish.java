package Dish;

public class TestDish {
    public static void main(String[] args) {
        Glass glass = new Glass("steklo", "-", 2,
                "-", 50.54, false);

        Plate plate = new Plate("farfor", "white", 1, "fixici", 20);

        Spoon spoon = new Spoon("steal", "-", 10, "-", 25);

        System.out.println(glass.toString());
        System.out.println(plate.toString());
        System.out.println(spoon.toString());
    }
}
