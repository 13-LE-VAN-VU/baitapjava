public class Main {
    public static void main(String[] args) {
        Ball ball = new Ball(50.0f, 50.0f, 10, 5, 45);
        System.out.println(ball);

        ball.move();
        System.out.println("After move: " + ball);

        ball.reflectHorizontal();
        ball.move();
        System.out.println("After reflect horizontal and move: " + ball);

        ball.reflectVertical();
        ball.move();
        System.out.println("After reflect vertical and move: " + ball);
    }
}
