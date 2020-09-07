package Dish;

public class Plate extends Dish{
    int radius;

    public Plate(String material, String color, int count, String painting, int radius) {
        super(material, color, count, painting);

        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "radius=" + radius +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", count=" + count +
                ", painting='" + painting + '\'' +
                '}';
    }
}
