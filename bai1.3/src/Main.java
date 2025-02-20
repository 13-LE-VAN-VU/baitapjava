public class Main {
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle();
        System.out.println(rect1.toString());
        System.out.println("Chiều dài: " + rect1.getLength());
        System.out.println("Chiều rộng: " + rect1.getWidth());
        System.out.println("Diện tích: " + rect1.getArea());
        System.out.println("Chu vi: " + rect1.getPerimeter());

        Rectangle rect2 = new Rectangle(5.0f, 3.0f);
        System.out.println("\n" + rect2.toString());
        System.out.println("Chiều dài: " + rect2.getLength());
        System.out.println("Chiều rộng: " + rect2.getWidth());
        System.out.println("Diện tích: " + rect2.getArea());
        System.out.println("Chu vi: " + rect2.getPerimeter());
        rect2.setLength(10.0f);
        rect2.setWidth(7.0f);
        System.out.println("\nSau khi thay đổi chiều dài và chiều rộng:");
        System.out.println(rect2.toString());
        System.out.println("Diện tích: " + rect2.getArea());
        System.out.println("Chu vi: " + rect2.getPerimeter());
    }
}
