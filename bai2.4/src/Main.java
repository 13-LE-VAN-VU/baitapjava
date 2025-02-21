public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "Nguyen Van A", 10);
        System.out.println(customer);

        Invoice invoice = new Invoice(101, customer, 1000.0);
        System.out.println(invoice);

        System.out.println("ID khách hàng: " + invoice.getCustomerId());
        System.out.println("Tên khách hàng: " + invoice.getCustomerName());
        System.out.println("Chiết khấu: " + invoice.getCustomerDiscount() + "%");
        System.out.println("Số tiền sau chiết khấu: " + invoice.getAmountAfterDiscount());

        invoice.setAmount(1500.0);
        customer.setDiscount(20);

        System.out.println(invoice);
        System.out.println("Số tiền sau chiết khấu (mới): " + invoice.getAmountAfterDiscount());
    }
}
