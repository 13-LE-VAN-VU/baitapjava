public class Main {
    public static void main(String[] args) {
        ResizableCircle resizableCircle = new ResizableCircle(10.0);

        System.out.println(resizableCircle);
        System.out.println("Perimeter: " + resizableCircle.getPerimeter());
        System.out.println("Area: " + resizableCircle.getArea());
        System.out.println("Diameter: " + resizableCircle.getDiameter());

        resizableCircle.resize(50);
        System.out.println("\nAfter resizing by 50%:");
        System.out.println(resizableCircle);
        System.out.println("Perimeter: " + resizableCircle.getPerimeter());
        System.out.println("Area: " + resizableCircle.getArea());
        System.out.println("Diameter: " + resizableCircle.getDiameter());

        resizableCircle.resize(200);
        System.out.println("\nAfter resizing by 200%:");
        System.out.println(resizableCircle);
        System.out.println("Perimeter: " + resizableCircle.getPerimeter());
        System.out.println("Area: " + resizableCircle.getArea());
        System.out.println("Diameter: " + resizableCircle.getDiameter());
    }
}
