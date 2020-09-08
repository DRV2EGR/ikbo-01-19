package ru.mirea.ikbo01_19.practice3.Rogov;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {

    }

    public Shape(String color, boolean field) {
        this.color = color;
        this.filled = field;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean field) {
        this.filled = field;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
