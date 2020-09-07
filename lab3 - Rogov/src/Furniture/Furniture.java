package Furniture;

public abstract class Furniture {
    int age;
    double hp;
    boolean is_saled;
    String name;

    public Furniture(int age, double hp, boolean is_saled, String name) {
        this.age = age;
        this.hp = hp;
        this.is_saled = is_saled;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public boolean isIs_saled() {
        return is_saled;
    }

    public void setIs_saled(boolean is_saled) {
        this.is_saled = is_saled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
