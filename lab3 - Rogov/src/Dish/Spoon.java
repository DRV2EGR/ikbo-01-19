package Dish;

public class Spoon extends Dish {
    int length;

    public Spoon(String material, String color, int count, String painting, int length) {
        super(material, color, count, painting);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Spoon{" +
                "length=" + length +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", count=" + count +
                ", painting='" + painting + '\'' +
                '}';
    }
}
