package Interfaces;

import ru.mirea.ikbo01_19.Rogov.practice16.MenueItem;

public interface OrdersManager {
    int itemsQuantity(String itemName);
    int itemsQuantity(MenueItem item);
    Order[] getOrders();
    int ordersCostSummary();
    int ordersQuantity();
}
