public class Main {
    public static void main(String[] args) {
        Ball ball = new Ball(0.0f, 0.0f, 5, 1.5f, 2.0f);

        System.out.println(ball);

        ball.move();
        System.out.println("Sau khi di chuyển: " + ball);

        ball.reflectHorizontal();
        ball.move();
        System.out.println("Phản chiếu ngang và di chuyển: " + ball);

        ball.reflectVertical();
        ball.move();
        System.out.println("Phản chiếu dọc và di chuyển: " + ball);
    }
}
