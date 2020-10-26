package ru.mirea.ikbo01_19.Rogov.practice16;

import Enums.DrinkTypeEnum;
import Immutables.Dish;
import Immutables.Drink;

public class sloving_practice16 {

    public static void main(String[] args) {
        TableOrder to = new TableOrder();

        to.add(new Dish(15, "Burger", "Big burger"));
        to.add(new Drink(10, "Lipton",
                "Lipton Tea", 0, DrinkTypeEnum.BLACK_TEA));
        to.add(new Dish(25, "del", "-"));
        to.add(new Drink(120, "Apsni",
                "Abkhasian wine Apshi",
                12, DrinkTypeEnum.WINE));
        to.add(new Dish(17, "del", "-"));

        System.out.println("------------------------------");
        for (MenueItem item: to.getItems()) {
            System.out.println(item + " ");
        }
        System.out.println();

        System.out.println(to.itemQuantity("Burger"));
        System.out.println(to.costTotal());
        System.out.println(to.remove("Lipton"));

        System.out.println("------------------------------");
        for (MenueItem item: to.getItems()) {
            System.out.println(item + " ");
        }
        System.out.println();

        System.out.println(to.costTotal());
        to.removeAll("del");
        System.out.println(to.costTotal());

        System.out.println("------------------------------");
        for (MenueItem item: to.getItems()) {
            System.out.println(item + " ");
        }
        System.out.println();

        TablesOrderManager tom = new TablesOrderManager(3);
        tom.add(to, 1);

        System.out.println(tom.ordersCostSummary());

        InternetOrdersManager iom = new InternetOrdersManager();
        iom.add(new MenueItem(68, "pyt", "DgtgdG"));
        System.out.println(iom.costTotal());
    }
}
