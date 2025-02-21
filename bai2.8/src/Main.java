public class Main {
    public static void main(String[] args) {
        MyCircle circle1 = new MyCircle(1, 2, 5);
        System.out.println(circle1);

        MyPoint center = new MyPoint(3, 4);
        MyCircle circle2 = new MyCircle(center, 10);
        System.out.println(circle2);

        System.out.println("Diện tích hình tròn: " + circle2.getArea());
        System.out.println("Chu vi hình tròn: " + circle2.getCircumference());
        System.out.println("Khoảng cách giữa hai tâm: " + circle1.distance(circle2));

        circle2.setCenterXY(0, 0);
        System.out.println("MyCircle sau khi cập nhật: " + circle2);
    }
}
