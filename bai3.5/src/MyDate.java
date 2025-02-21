public class MyDate {
    private int year;
    private int month;
    private int day;

    public static final String[] MONTHS = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
    };

    public static final String[] DAYS = {
            "Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"
    };

    public static final int[] DAYS_IN_MONTHS = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999 || month < 1 || month > 12) {
            return false;
        }
        int maxDay = DAYS_IN_MONTHS[month - 1];
        if (month == 2 && isLeapYear(year)) {
            maxDay = 29;
        }
        return day >= 1 && day <= maxDay;
    }

    public void setDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid date");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() { return year; }
    public int getMonth() { return month; }
    public int getDay() { return day; }

    public void setYear(int year) { this.year = year; }
    public void setMonth(int month) { this.month = month; }
    public void setDay(int day) { this.day = day; }

    @Override
    public String toString() {
        return String.format("%s %d %s %d", DAYS[getDayOfWeek(year, month, day)], day, MONTHS[month - 1], year);
    }

    public static int getDayOfWeek(int year, int month, int day) {
        int y = year - (14 - month) / 12;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = (day + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
        return d;
    }


}
