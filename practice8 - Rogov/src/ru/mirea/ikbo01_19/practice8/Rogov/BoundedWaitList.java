package ru.mirea.ikbo01_19.practice8.Rogov;

import java.util.concurrent.ConcurrentLinkedQueue;

public class BoundedWaitList<E> extends WaitList {
    private int capacity;

    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(Object element) {
        if (super.content.size() != capacity) {
            super.add(element);
        } else {
            System.out.println("Can't add! Capacity check!");
        }
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                ", content=" + content +
                '}';
    }
}
