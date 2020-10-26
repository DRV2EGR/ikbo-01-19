package ru.mirea.ikbo01_19.Rogov.practice16;

public class MenueItem {
    private int cost;
    private String name;
    private String description;



    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public MenueItem(int cost, String name, String description) {
        this.cost = cost;
        this.name = name;
        this.description = description;
    }
}
