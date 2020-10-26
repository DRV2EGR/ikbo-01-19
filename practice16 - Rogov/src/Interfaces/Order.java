package Interfaces;

import Immutables.Customer;
import ru.mirea.ikbo01_19.Rogov.practice16.MenueItem;

public interface Order {
    boolean add(MenueItem item);
    String[] itemNames();
    int itemsQuantity();
    int itemQuantity(String itemName);
    int itemQuantity(MenueItem itemName);
    MenueItem[] getItems();
    boolean remove(String itemName);
    boolean remove(MenueItem item);
    int removeAll(String itemName);
    int removeAll(MenueItem item);
    MenueItem[] sortedItemsByCostDesc();
    int costTotal();
    Customer getCustomer();
    void setCustomer(Customer customer);
}
