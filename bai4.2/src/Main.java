public class Main {
    public static void main(String[] args) {
        Person person = new Person("John Doe", "123 Elm St");
        System.out.println(person);

        Student student = new Student("Jane Smith", "456 Oak St", "Computer Science", 2023, 15000.0);
        System.out.println(student);

        Staff staff = new Staff("Mike Brown", "789 Pine St", "High School", 3500.0);
        System.out.println(staff);
    }
}
