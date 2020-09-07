package Furniture;

import Furniture.Bed.*;
import Furniture.Chiar.*;
import Furniture.Shkaf.*;

import java.util.ArrayList;

public class FurnitureShop {
    ArrayList items;
    double budget;

    public FurnitureShop(ArrayList items, double budget) {
        items = new ArrayList();
        this.items = items;
        this.budget = budget;
    }

    public FurnitureShop(double budget) {
        items = new ArrayList();
        this.budget = budget;
    }

    public void add_item(Bed item) {
        this.items.add(item);
    }

    public void add_item(Chiar item) {
        this.items.add(item);
    }

    public void add_item(Shkaf item) {
        this.items.add(item);
    }

    public void list_items() {
        System.out.println(items.toString());
    }

    public ArrayList getItems() {
        return items;
    }

    public void setItems(ArrayList items) {
        this.items = items;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}
