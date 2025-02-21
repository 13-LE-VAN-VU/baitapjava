public class Main {
    public static void main(String[] args) {
        InvoiceItem item = new InvoiceItem("A01", "Bàn phím", 10, 150.5);

        System.out.println(item);

        System.out.println("Tổng giá trị: " + item.getTotal());

        item.setQty(15);
        item.setUnitPrice(140.0);

        System.out.println("Số lượng mới: " + item.getQty());
        System.out.println("Đơn giá mới: " + item.getUnitPrice());
        System.out.println("Tổng giá trị mới: " + item.getTotal());
    }
}
