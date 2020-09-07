package Furniture;

public class Bed extends Furniture {
    double price;
    float spalnost;

    public Bed(int age, double hp, boolean is_saled,
               String name, double price, float spalnost) {
        super(age, hp, is_saled, name);
        this.price = price;
        this.spalnost = spalnost;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public float getSpalnost() {
        return spalnost;
    }

    public void setSpalnost(float spalnost) {
        this.spalnost = spalnost;
    }


    @Override
    public String toString() {
        return "Bed{" +
                "price=" + price +
                ", spalnost=" + spalnost +
                ", age=" + age +
                ", hp=" + hp +
                ", is_saled=" + is_saled +
                ", name='" + name + '\'' +
                '}';
    }
}
