package ru.mirea.ikbo01_19.Rogov.practice16;

import Immutables.Customer;
import Interfaces.Order;

public class InternetOrder implements Order {
    private int size;
    private ListNode head;
    private ListNode tail; // Last elem

    public InternetOrder() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public boolean add(MenueItem item) {
        if (size == 0) {
            this.head = new ListNode(item);
            this.tail = this.head;
            ++size;
            return true;
        }

        tail.next = new ListNode(item);
        this.tail = this.tail.next;
        ++size;
        return true;
    }

    @Override
    public String[] itemNames() {
        ListNode _p = this.head;
        String[] _result = new String[size];

        int i = 0;
        while(_p != null) {
            _result[i] = _p.value.getName();
            ++i;
        }

        return _result;
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemQuantity(String itemName) {
        ListNode _p = this.head;
        int _result = 0;

        int i = 0;
        while(_p != null) {
            if (_p.value.getName().equals(itemName)) {
                ++_result;
            }
            ++i;
        }

        return _result;
    }

    @Override
    public int itemQuantity(MenueItem itemName) {
        ListNode _p = this.head;
        int _result = 0;

        int i = 0;
        while(_p != null) {
            if (_p.value.getName().equals(itemName.getName())) {
                ++_result;
            }
            ++i;
        }

        return _result;
    }

    @Override
    public MenueItem[] getItems() {
        MenueItem[] _items = new MenueItem[size];

        ListNode _p = this.head;
        int i = 0;
        while(_p != null) {
            _items[i] = _p.value;
            ++i;
        }

        return _items;
    }

    @Override
    public boolean remove(String itemName) {
        ListNode _prev = null;
        ListNode _this = this.head;

        while(_this != null) {
            if (_this.value.getName().equals(itemName)) {
                _prev.next = _this.next;
                --size;

                return true;
            }

            _prev = _this;
            _this = _this.next;
        }

        return false;
    }

    @Override
    public boolean remove(MenueItem item) {
        ListNode _prev = null;
        ListNode _this = this.head;

        while(_this != null) {
            if (_this.value.getName().equals(item.getName())) {
                _prev.next = _this.next;
                --size;

                return true;
            }

            _prev = _this;
            _this = _this.next;
        }

        return false;
    }

    @Override
    public int removeAll(String itemName) {
        int _result  = 0;
        ListNode _prev = null;
        ListNode _this = this.head;

        while(_this != null) {
            if (_this.value.getName().equals(itemName)) {
                _prev.next = _this.next;
                ++_result;
                --size;
            }

            _prev = _this;
            _this = _this.next;
        }

        return _result;

    }

    @Override
    public int removeAll(MenueItem item) {
        int _result  = 0;
        ListNode _prev = null;
        ListNode _this = this.head;

        while(_this != null) {
            if (_this.value.getName().equals(item.getName())) {
                _prev.next = _this.next;
                ++_result;
                --size;
            }

            _prev = _this;
            _this = _this.next;
        }

        return _result;
    }

    @Override
    public MenueItem[] sortedItemsByCostDesc() {
        //TODO: SORTING IN INTRNET ORDER (ОДНОСВЯЗНЫЙ СПИСОК)
        return null;
    }

    @Override
    public int costTotal() {
        int _result = 0;
        MenueItem[] _items = new MenueItem[size];

        ListNode _p = this.head;
        int i = 0;
        while(_p != null) {
            _result = _p.value.getCost();
            ++i;
            _p = _p.next;
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
