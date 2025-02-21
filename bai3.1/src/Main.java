public class Main {
    public static void main(String[] args) {
        MyComplex c1 = new MyComplex(3.0, 4.0);
        MyComplex c2 = new MyComplex(1.0, 2.0);

        System.out.println(c1);
        System.out.println("Là số thực? " + c1.isReal());
        System.out.println("Là số ảo? " + c1.isImaginary());

        System.out.println("Bằng với (3.0, 4.0)? " + c1.equals(3.0, 4.0));
        System.out.println("Bằng với c2? " + c1.equals(c2));

        System.out.println("Độ lớn: " + c1.magnitude());

        c1.addInto(c2);
        System.out.println("Sau khi cộng vào c2: " + c1);

        MyComplex c3 = c1.addNew(c2);
        System.out.println("Cộng tạo mới với c2: " + c3);
    }
}
