public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account("A001", "Nguyen Van A", 5000);
        Account acc2 = new Account("A002", "Tran Thi B", 3000);

        System.out.println(acc1);
        System.out.println(acc2);

        acc1.credit(1000);
        System.out.println("Sau khi nạp tiền vào acc1: " + acc1.getBalance());

        acc1.debit(2000);
        System.out.println("Sau khi rút tiền từ acc1: " + acc1.getBalance());

        acc1.transferTo(acc2, 1500);
        System.out.println("Sau khi chuyển tiền từ acc1 sang acc2:");
        System.out.println(acc1);
        System.out.println(acc2);
    }
}
