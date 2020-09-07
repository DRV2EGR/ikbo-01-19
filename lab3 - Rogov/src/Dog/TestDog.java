package Dog;

public class TestDog {
    public static void main(String[] args) {
        Haski haski = new Haski("Djim", 3, "Haski_3", 1,
                false, "---", "Haski_3");
        Labrodor labrodor = new Labrodor("Fert", 10, "Labr_1",
                2, false, "---", "Labr_1", 22, 5);

        System.out.println(haski.toString());
        System.out.println(labrodor.toString());
    }
}
