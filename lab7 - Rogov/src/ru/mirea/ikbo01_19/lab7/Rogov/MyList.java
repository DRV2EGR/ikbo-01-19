package ru.mirea.ikbo01_19.lab7.Rogov;

import jdk.internal.util.ArraysSupport;

import java.util.*;
import java.util.stream.Stream;

public class MyList<E> extends AbstractList<E> implements List<E> {
    private int size;
    transient Object[] elementData; // Массив!

    MyList() {
        this.elementData = new Object[] {};
    }

    MyList(Collection <? extends E> col) {
        Object[] a = col.toArray();
        if ((size = a.length) != 0) {
            if (col.getClass() == ArrayList.class) {
                elementData = a;
            } else {
                elementData = Arrays.copyOf(a, size, Object[].class);
            }
        } else {
            // replace with empty array.
            elementData = new Object[] {};
        }
    }

    MyList (int capacity) {
        if (capacity > 0) {
            this.elementData = new Object[capacity];
        } else if (capacity == 0) {
            this.elementData = new Object[]{};
        }
    }

    @Override
    public int size(){
        return size;
    }



    @Override
    public E get(int index) {
        if (index < size) {
            return elementData(index);
        }
        return null;
    }

    private E elementData(int index) {
        return (E) elementData[index];
    }


    public void add(E e, int s) {
        if (s == elementData.length)
            elementData = grow();
        elementData[s] = e;
        size = s + 1;
    }

    private Object[] grow(int minCapacity) {
        int oldCapacity = elementData.length;
        if (oldCapacity > 0) {
            int newCapacity = ArraysSupport.newLength(oldCapacity,
                    minCapacity - oldCapacity, /* minimum growth */
                    oldCapacity >> 1           /* preferred growth */);
            return elementData = Arrays.copyOf(elementData, newCapacity);
        } else {
            return elementData = new Object[(minCapacity)];
        }
    }

    private Object[] grow() {
        return grow(size + 1);
    }


}
