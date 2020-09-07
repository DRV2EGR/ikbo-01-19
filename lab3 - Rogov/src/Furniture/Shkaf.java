package Furniture;

public class Shkaf extends Furniture{
    String izgotovitel;
    double price;

    public Shkaf(int age, double hp, boolean is_saled, String name, String izgotovitel, double price) {
        super(age, hp, is_saled, name);
        this.izgotovitel = izgotovitel;
        this.price = price;
    }

    public String getIzgotovitel() {
        return izgotovitel;
    }

    public void setIzgotovitel(String izgotovitel) {
        this.izgotovitel = izgotovitel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Shkaf{" +
                "izgotovitel='" + izgotovitel + '\'' +
                ", price=" + price +
                ", age=" + age +
                ", hp=" + hp +
                ", is_saled=" + is_saled +
                ", name='" + name + '\'' +
                '}';
    }
}
