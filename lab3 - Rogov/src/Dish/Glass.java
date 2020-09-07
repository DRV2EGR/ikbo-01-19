package Dish;

public class Glass extends Dish{
    double water_count;
    boolean is_transparent;


    public Glass(String material, String color, int count, String painting,
                 double water_count, boolean is_transparent) {
        super(material, color, count, painting);

        this.water_count = water_count;
        this.is_transparent = is_transparent;
    }

    public double getWater_count() {
        return water_count;
    }

    public void setWater_count(double water_count) {
        this.water_count = water_count;
    }

    public boolean isIs_transparent() {
        return is_transparent;
    }

    public void setIs_transparent(boolean is_transparent) {
        this.is_transparent = is_transparent;
    }

    @Override
    public String toString() {
        return "Glass{" +
                "water_count=" + water_count +
                ", is_transparent=" + is_transparent +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", count=" + count +
                ", painting='" + painting + '\'' +
                '}';
    }
}
