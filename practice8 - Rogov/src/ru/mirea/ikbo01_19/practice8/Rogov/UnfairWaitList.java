package ru.mirea.ikbo01_19.practice8.Rogov;

public class UnfairWaitList<E> extends WaitList {
    public UnfairWaitList() {

    }

    public Object remove(E element) {
        return super.content.remove(element);
    }

    public void moveToBack(E element) {
        this.remove(element);
        super.add(element);
    }
}
