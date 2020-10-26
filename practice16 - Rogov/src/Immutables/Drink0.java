package Immutables;

import Interfaces.Item;

//IMMUTABLE aka objects are const
public final class Drink0 implements Item {
    private int cost;
    private String name;
    private String description;


    public Drink0(int cost, String description, String name) {
        this.cost = cost;
        this.description = description;
        this.name = name;
    }

    public Drink0(String description, String name) {
        this.cost = 0;
        this.description = description;
        this.name = name;
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
