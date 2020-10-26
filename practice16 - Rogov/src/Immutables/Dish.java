package Immutables;

import Enums.DrinkTypeEnum;
import Interfaces.Item;
import ru.mirea.ikbo01_19.Rogov.practice16.MenueItem;

public final class Dish extends MenueItem implements Item {

    public Dish(int cost, String name, String description) {
        super(cost, name, description);
    }

    @Override
    public String toString() {
        return "Блюдо{ " +
                "Тип блюда=" + super.getName() +
                " }";
    }
}
