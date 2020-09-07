package Dish;

public abstract class Dish {
    String material;
    String color;
    int count;
    String painting;

    public Dish(String material, String color, int count, String painting) {
        this.material = material;
        this.color = color;
        this.count = count;
        this.painting = painting;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getPainting() {
        return painting;
    }

    public void setPainting(String painting) {
        this.painting = painting;
    }
}
