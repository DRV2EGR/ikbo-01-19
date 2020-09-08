package ru.mirea.ikbo01_19.practice3.Rogov;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean field) {
        super(side, side, color, field);
    }

    public double getSide() {
        return length;
    }

    public void setSide(double side) {
        length = side;
        width = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double side) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
