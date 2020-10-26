package ru.mirea.ikbo01_19.lab10.Rogov;

import java.util.ArrayList;

public class task2 <E> {
    private ArrayList<E> content;

    // Sloving task 3 in task 2!!!!!!!!

    task2() {
        content = new ArrayList<>();
    }

    public E get(int index) {
        if (index >= content.size()) {
            return null;
        } else {
            for (int i = 0; i < content.size(); ++i) {
                if (i == index) {
                    return content.get(i);
                }
            }
        }

        return null;
    }

    public void push(E data) {
        content.add(data);
    }

    public void push(E data, int index) {
        content.add(index, data);
    }

}
