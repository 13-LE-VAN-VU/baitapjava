public class Main {
    public static void main(String[] args) {

        MyPoint p1 = new MyPoint();
        System.out.println("Điểm p1: " + p1);

        MyPoint p2 = new MyPoint(3, 4);
        System.out.println("Điểm p2: " + p2);

        System.out.println("Tọa độ x của p2: " + p2.getX());
        System.out.println("Tọa độ y của p2: " + p2.getY());
        int[] coords = p2.getXY();
        System.out.println("Mảng tọa độ của p2: [" + coords[0] + ", " + coords[1] + "]");

        p1.setXY(1, 2);
        System.out.println("Điểm p1 sau khi cập nhật: " + p1);

        System.out.println("Khoảng cách từ p1 đến (3,4): " + p1.distance(3, 4));
        System.out.println("Khoảng cách từ p1 đến p2: " + p1.distance(p2));
        System.out.println("Khoảng cách từ p2 đến gốc tọa độ: " + p2.distance());
    }
}
