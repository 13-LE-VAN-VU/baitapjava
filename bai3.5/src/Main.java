public class Main {
    public static void main(String[] args) {
        MyDate date = new MyDate(2023, 12, 31);
        System.out.println("Initial date: " + date);

        System.out.println("Next day: " + date.nextDay());
        System.out.println("Next month: " + date.nextMonth());
        System.out.println("Next year: " + date.nextYear());

        System.out.println("Previous day: " + date.previousDay());
        System.out.println("Previous month: " + date.previousMonth());
        System.out.println("Previous year: " + date.previousYear());

        date.setDate(2020, 2, 29);
        System.out.println("Leap year date: " + date);
        System.out.println("Next day after leap day: " + date.nextDay());
    }
}
