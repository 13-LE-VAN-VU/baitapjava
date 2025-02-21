public class Main {
    public static void main(String[] args) {
        Date date = new Date(20, 2, 2025);

        System.out.println(date);

        date.setDay(21);
        date.setMonth(3);
        date.setYear(2024);

        System.out.println("Ngày: " + date.getDay());
        System.out.println("Tháng: " + date.getMonth());
        System.out.println("Năm: " + date.getYear());

        date.setDate(15, 8, 2023);
        System.out.println("Ngày mới: " + date);
    }
}
