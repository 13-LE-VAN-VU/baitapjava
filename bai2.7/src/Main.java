public class Main {
    public static void main(String[] args) {
        MyLine line1 = new MyLine(1, 2, 4, 6);
        System.out.println(line1);

        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(3, 4);
        MyLine line2 = new MyLine(p1, p2);
        System.out.println(line2);

        System.out.println("Độ dài đoạn thẳng: " + line2.getLength());
        System.out.println("Độ dốc đoạn thẳng (radian): " + line2.getGradient());

        line2.setBeginXY(1, 1);
        line2.setEndXY(5, 5);
        System.out.println("Line sau khi cập nhật: " + line2);
    }
}
