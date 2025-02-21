public class Main {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1);

        Cylinder cylinder2 = new Cylinder(2.5);
        System.out.println(cylinder2);


        Cylinder cylinder3 = new Cylinder(2.5, 5.0);
        System.out.println(cylinder3);


        Cylinder cylinder4 = new Cylinder(2.5, 5.0, "blue");
        System.out.println(cylinder4);


        System.out.println("Volume of cylinder4: " + cylinder4.getVolume());

    }
}
