public class Main {
    public static void main(String[] args) {
        Time time = new Time(23, 59, 59);

        System.out.println(time);

        time.nextSecond();
        System.out.println("Sau 1 giây: " + time);

        time.previousSecond();
        System.out.println("Trước 1 giây: " + time);

        time.setTime(12, 0, 0);
        System.out.println("Giờ mới: " + time);

        time.setHour(6);
        time.setMinute(30);
        time.setSecond(45);
        System.out.println("Cập nhật giờ: " + time);
    }
}
