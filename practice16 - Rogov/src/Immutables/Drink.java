package Immutables;

import Interfaces.Alcoholable;
import Enums.DrinkTypeEnum;
import Interfaces.Item;
import ru.mirea.ikbo01_19.Rogov.practice16.MenueItem;

public final class Drink extends MenueItem implements Alcoholable, Item {

    private double alchogolVol;
    private DrinkTypeEnum type;

    public DrinkTypeEnum getType() {
        return type;
    }

    @Override
    public boolean isAlcphplicDrink() {
        if (alchogolVol > 0) {
            return true;
        }
        return false;
    }

    @Override
    public double getAlchogolVol() {
        return alchogolVol;
    }

    public Drink(int cost, String name, String description, double alchogolVol, DrinkTypeEnum type) {
        super(cost, name, description);
        this.alchogolVol = alchogolVol;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Напиток{" +
                "алкоголь=" + alchogolVol +
                ", тип напитка" + type +
                '}';
    }
}
