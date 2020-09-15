package Movable;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint mp = new MovablePoint(1, 1, 2, 3);
        MovableCircle mc = new MovableCircle(5, 75, 45, 0, 15);
        MovableRectangle mr = new MovableRectangle(55, 23, 75, 48, 45, 98);

        System.out.println("MovablePoint" + mp.toString());
        System.out.println("MovableCircle" + mc.toString());
        System.out.println("MovableRectangle" + mr.toString());

        mp.moveUp();
        mc.moveLeft();
        mr.moveRight();


        System.out.println();
        System.out.println("MovablePoint" + mp.toString());
        System.out.println("MovableCircle" + mc.toString());
        System.out.println("MovableRectangle" + mr.toString());

        System.out.println("MovableRectangle speeds equals " + mr.speed_equals());
    }
}
