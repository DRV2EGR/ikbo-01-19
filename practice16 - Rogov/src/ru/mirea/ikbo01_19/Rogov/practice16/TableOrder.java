package ru.mirea.ikbo01_19.Rogov.practice16;

import Immutables.Customer;
import Interfaces.Order;

public class TableOrder implements Order {
    private int size;
    private MenueItem[] items;

    public TableOrder() {
        size = 0;
        items = new MenueItem[size];
    }

    @Override
    public boolean add(MenueItem item) {
        MenueItem[] _items = new MenueItem[size + 1];
        for (int i = 0; i < size; i++) {
            _items[i] = items[i];
        }

        _items[size] = item;
        try {
            ++size;
            items = _items;
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    @Override
    public String[] itemNames() {
        String[] _names = new String[size];
        for (int i = 0; i < size; i++) {
            _names[i] = items[i].getName();
        }

        return _names;
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemQuantity(String itemName) {
        int _result = 0;

        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(itemName)) {
                ++_result;
            }
        }

        return _result;
    }

    @Override
    public int itemQuantity(MenueItem itemName) {
        int _result = 0;

        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(itemName.getName())) {
                ++_result;
            }
        }

        return _result;
    }

    @Override
    public MenueItem[] getItems() {
        return items;
    }

    @Override
    public boolean remove(String itemName) {
        boolean flag = true;
        int _size = size;
        MenueItem[] _items = new MenueItem[size-1];

        int j = 0;
        for(int i = 0; i < size; ++i) {
            if (flag && items[i].getName().equals(itemName)) {
                flag = false;
                --_size;
            } else {
                _items[j] = items[i];
                ++j;
            }
        }

        size = _size;
        items = _items;
        return true;
    }

    @Override
    public boolean remove(MenueItem item) {
        boolean flag = true;
        int _size = size;
        MenueItem[] _items = new MenueItem[size-1];

        int j = 0;
        for(int i = 0; i < size; ++i) {
            if (flag && items[i].getName().equals(item.getName())) {
                flag = false;
                --_size;
            } else {
                _items[j] = items[i];
                ++j;
            }
        }

        size = _size;
        items = _items;
        return true;
    }

    @Override
    public int removeAll(String itemName) {
        int _deleted_count = 0;
        int _msize = size;
        int _size = this.size - this.itemQuantity(itemName);
        MenueItem[] _items = new MenueItem[_size];

        int j = 0;
        for(int i = 0; i < size; ++i) {
            if (items[i].getName().equals(itemName)) {
                ++_deleted_count;
                --_msize;
            } else {
                _items[j] = items[i];
                ++j;
            }
        }

        size = _msize;
        items = _items;
        return _deleted_count;
    }

    @Override
    public int removeAll(MenueItem item) {
        int _deleted_count = 0;
        int _msize = size;
        int _size = this.size - this.itemQuantity(item);
        MenueItem[] _items = new MenueItem[_size];

        int j = 0;
        for(int i = 0; i < size; ++i) {
            if (items[i].getName().equals(item.getName())) {
                ++_deleted_count;
                --_msize;
            } else {
                _items[j] = items[i];
                ++j;
            }
        }

        size = _msize;
        items = _items;
        return _deleted_count;
    }

    @Override
    public MenueItem[] sortedItemsByCostDesc() {
        //TODO: SORT MENUE ITEMS IN TABLE ORDER
        return null;
    }

    @Override
    public int costTotal() {
        int _result = 0;
        for (int i = 0; i < size; i++) {
            _result += items[i].getCost();
        }

        return _result;
    }

    //TODO: Непонятно, что делают функции Customer, если нет такого свойства у объекта
    @Override
    public Customer getCustomer() {
        return null;
    }

    @Override
    public void setCustomer(Customer customer) {

    }
}
