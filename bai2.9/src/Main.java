public class Main {
    public static void main(String[] args) {
        MyTriangle triangle1 = new MyTriangle(0, 0, 3, 0, 0, 4);
        System.out.println(triangle1);
        System.out.println("Chu vi: " + triangle1.getPerimeter());
        System.out.println("Loại tam giác: " + triangle1.getType());

        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(1, 1);
        MyPoint p3 = new MyPoint(1, 0);
        MyTriangle triangle2 = new MyTriangle(p1, p2, p3);
        System.out.println(triangle2);
        System.out.println("Chu vi: " + triangle2.getPerimeter());
        System.out.println("Loại tam giác: " + triangle2.getType());
    }
}
