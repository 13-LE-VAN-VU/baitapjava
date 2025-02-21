public class Main {
    public static void main(String[] args) {
        Point point = new Point(2.5f, 3.5f);
        System.out.println(point);

        MovablePoint movablePoint = new MovablePoint(1.0f, 2.0f, 0.5f, 0.5f);
        System.out.println(movablePoint);

        movablePoint.move();
        System.out.println(movablePoint);

        movablePoint.setSpeed(1.0f, 1.5f);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
