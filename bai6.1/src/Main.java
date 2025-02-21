public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5.5, "blue", false);
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Color: " + circle.getColor());
        System.out.println("Filled: " + circle.isFilled());

        Circle c1 = (Circle) circle;
        System.out.println(c1);
        System.out.println("Radius: " + c1.getRadius());

        Shape rectangle = new Rectangle(2.0, 4.0, "green", true);
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        Rectangle r1 = (Rectangle) rectangle;
        System.out.println(r1);
        System.out.println("Length: " + r1.getLength());
        System.out.println("Width: " + r1.getWidth());

        Shape square = new Square(6.6);
        System.out.println(square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());

        Square s1 = (Square) square;
        System.out.println(s1);
        System.out.println("Side: " + s1.getSide());
    }
}
