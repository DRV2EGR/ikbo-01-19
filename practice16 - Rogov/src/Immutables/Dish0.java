package Immutables;

import Interfaces.Item;

public final class Dish0 implements Item {
    private final int cost;
    private final String name;
    private final String description;

    public Dish0(int cost, String name, String description) {
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    public Dish0(String name, String description) {
        this.cost = 0;

        this.name = name;
        this.description = description;
    }

    @Override
    public int getCost() {
        return cost;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getDescription() {
        return description;
    }
}
