package Furniture;

public class Chiar extends Furniture {
    double price;
    int nomber_of_legs;

    public Chiar(int age, double hp, boolean is_saled, String name,
                 double price, int nomber_of_legs) {
        super(age, hp, is_saled, name);
        this.price = price;
        this.nomber_of_legs = nomber_of_legs;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNomber_of_legs() {
        return nomber_of_legs;
    }

    public void setNomber_of_legs(int nomber_of_legs) {
        this.nomber_of_legs = nomber_of_legs;
    }


    @Override
    public String toString() {
        return "Chiar{" +
                "price=" + price +
                ", nomber_of_legs=" + nomber_of_legs +
                ", age=" + age +
                ", hp=" + hp +
                ", is_saled=" + is_saled +
                ", name='" + name + '\'' +
                '}';
    }
}
