public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3.5f, 4.5f);
        System.out.println(point2D);
        Point3D point3D = new Point3D(1.2f, 3.4f, 5.6f);
        System.out.println(point3D);

        point3D.setXYZ(7.8f, 9.0f, 1.2f);
        System.out.println(point3D);

        float[] coords2D = point2D.getXY();
        System.out.println("Point2D coordinates: x=" + coords2D[0] + ", y=" + coords2D[1]);

        float[] coords3D = point3D.getXYZ();
        System.out.println("Point3D coordinates: x=" + coords3D[0] + ", y=" + coords3D[1] + ", z=" + coords3D[2]);
    }
}
