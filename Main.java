public class Main {
    public static void main(String[] args) {

        Circle circle1 = new Circle();
        System.out.println("Hình tròn 1:");
        System.out.println("Bán kính: " + circle1.getRadius());
        System.out.println("Diện tích: " + circle1.getArea());
        
        Circle circle2 = new Circle(5.0);
        System.out.println("\nHình tròn 2:");
        System.out.println("Bán kính: " + circle2.getRadius());
        System.out.println("Diện tích: " + circle2.getArea());
    }
}
