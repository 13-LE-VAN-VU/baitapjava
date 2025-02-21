public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "Nguyen", "An", 5000);

        System.out.println(emp);

        System.out.println("Annual Salary: " + emp.getAnnualSalary());

        emp.raiseSalary(10);
        System.out.println("After Raise: " + emp.getSalary());

        emp.setSalary(6000);
        System.out.println("Updated Salary: " + emp.getSalary());
    }
}
