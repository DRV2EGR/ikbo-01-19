package ru.mirea.ikbo01_19.Rogov.practice16;

import Interfaces.Order;
import Interfaces.OrdersManager;

public class TablesOrderManager implements OrdersManager {
    private TableOrder[] orders; // Список столиков

    public TablesOrderManager(int tableNombers) {
        this.orders = new TableOrder[tableNombers];
    }

    void add(TableOrder order, int tableNumber) {
        orders[tableNumber] = order;
    }

    void addItem (MenueItem item, int tableNumber) {
        orders[tableNumber].add(item);
    }

    void freeTableNumber(int tableNomber) {
        orders[tableNomber] = null;
    }

    void freeTableNumbers(int tableNombers[]) {
        for (int nom: tableNombers) {
            orders[nom] = null;
        }
    }

    Order getOrder(int tableNomber) {
        return orders[tableNomber];
    }

    void remove(int tableNomber) {
        //TODO: Как можно удалить какой-то столик???
    }


    @Override
    public int itemsQuantity(String itemName) {
        int _result = 0;

        for(TableOrder order: orders) {
            if (order != null) {
                _result += order.itemQuantity(itemName);
            }
        }

        return _result;
    }

    @Override
    public int itemsQuantity(MenueItem item) {
        int _result = 0;

        for(TableOrder order: orders) {
            if (order != null) {
                _result += order.itemQuantity(item);
            }
        }

        return _result;
    }

    @Override
    public TableOrder[] getOrders() {
        return orders;
    }

    @Override
    public int ordersCostSummary() {
        int _result = 0;

        for (TableOrder order: orders){
            if (order != null) {
                _result += order.costTotal();
            }
        }

        return _result;
    }

    @Override
    public int ordersQuantity() {
        int _result = 0;

        for (TableOrder order: orders){
            ++_result;
        }

        return _result;
    }
}
