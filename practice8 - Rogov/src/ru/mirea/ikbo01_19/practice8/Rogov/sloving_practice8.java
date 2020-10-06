package ru.mirea.ikbo01_19.practice8.Rogov;

public class sloving_practice8 {
    public static void main(String[] args) {
        BoundedWaitList<Integer> bl = new BoundedWaitList<Integer>(3);
        bl.add(5);
        bl.add(4);
        bl.add(3);
        bl.add(2);
        System.out.println("BoundedList: " + bl);

        UnfairWaitList<Integer> ul = new UnfairWaitList<Integer>();
        ul.add(7);
        ul.add(8);

        System.out.println("It's working!");
    }
}
