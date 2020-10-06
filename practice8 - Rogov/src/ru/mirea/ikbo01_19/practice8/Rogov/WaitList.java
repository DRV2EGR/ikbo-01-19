package ru.mirea.ikbo01_19.practice8.Rogov;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList {
    protected ConcurrentLinkedQueue<E> content;

    @Override
    public void add(Object element) {
        content.add((E) element);
    }

    @Override
    public Object remove() {
        return content.remove();
    }

    @Override
    public boolean contains(Object element) {
        return content.contains(element);
    }

    @Override
    public boolean containsAll(Collection c) {
        return content.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }

    public WaitList() {
        this.content = new ConcurrentLinkedQueue<E>();
    }

    public WaitList(ConcurrentLinkedQueue<E> content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }
}
