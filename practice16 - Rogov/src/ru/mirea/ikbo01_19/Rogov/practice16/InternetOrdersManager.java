package ru.mirea.ikbo01_19.Rogov.practice16;

import Interfaces.Order;
import Interfaces.OrdersManager;

public class InternetOrdersManager extends InternetOrder implements OrdersManager {

    public InternetOrdersManager() {
        super();
    }

    boolean add(InternetOrder order) {
        this.add(order);

        return true;
    }

    @Override
    public int itemsQuantity(String itemName) {
        return this.itemsQuantity(itemName);
    }

    @Override
    public int itemsQuantity(MenueItem item) {
        return this.itemsQuantity(item);
    }

    @Override
    public Order[] getOrders() {
        Order[] _orders = new Order[this.ordersQuantity()];
        _orders = this.getOrders();
        return _orders;
    }

    @Override
    public int ordersCostSummary() {
        return this.costTotal();
    }

    @Override
    public int ordersQuantity() {
        return this.ordersQuantity();
    }
}
