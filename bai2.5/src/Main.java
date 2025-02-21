public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer(1, "Nguyen Van A", 'm');
        System.out.println(customer);

        Account account = new Account(101, customer, 500.0);
        System.out.println(account);

        account.deposit(200.0);
        System.out.println("Sau khi gửi tiền: " + account);

        account.withdraw(100.0);
        System.out.println("Sau khi rút tiền: " + account);

        account.withdraw(700.0);
        System.out.println("Số dư hiện tại: " + account);

        Account account2 = new Account(102, customer);
        System.out.println(account2);
        account2.deposit(300.0);
        System.out.println("Tài khoản 2 sau khi gửi tiền: " + account2);
    }
}
