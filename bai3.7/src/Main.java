public class Main {
    public static void main(String[] args) {
        Ball ball = new Ball(5.0f, 10.0f, 2.0f);
        System.out.println(ball);

        Player player = new Player(7, 1.0f, 2.0f);
        System.out.println(player);

        player.move(3.0f, 4.0f);
        System.out.println("After moving: " + player);

        player.jump(5.0f);
        System.out.println("After jumping: " + player);

        System.out.println("Is player near the ball? " + player.near(ball));

        player.kick(ball);
        System.out.println("After kicking: " + ball);
    }
}