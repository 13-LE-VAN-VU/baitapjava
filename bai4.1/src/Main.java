public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5, "blue");
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());

        Cylinder cylinder = new Cylinder(2.5, 4.0, "green");
        System.out.println(cylinder);
        System.out.println("Volume: " + cylinder.getVolume());
    }
}
