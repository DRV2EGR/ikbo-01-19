package Movable;

public class MovableCircle extends MovablePoint implements Movable {
    private int radius;
    private MovablePoint m_center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        m_center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        this.m_center.moveUp();
    }

    @Override
    public void moveDown() {
        this.m_center.moveDown();
    }

    @Override
    public void moveLeft() {
        m_center.moveLeft();
    }

    @Override
    public void moveRight() {
        this.m_center.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + m_center +
                '}';
    }
}
