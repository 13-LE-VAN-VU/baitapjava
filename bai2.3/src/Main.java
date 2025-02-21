public class Main {
    public static void main(String[] args) {
        Author author = new Author("Nguyen Van A", "nguyenvana@example.com");

        Book book = new Book("978-1234567890", "Lập trình Java", author, 150.0, 10);

        System.out.println(book);

        System.out.println("ISBN: " + book.getIsbn());
        System.out.println("Tên sách: " + book.getName());
        System.out.println("Tác giả: " + book.getAuthorName());
        System.out.println("Giá sách: " + book.getPrice());
        System.out.println("Số lượng tồn kho: " + book.getQty());

        book.setPrice(200.0);
        book.setQty(20);

        System.out.println("Giá mới: " + book.getPrice());
        System.out.println("Số lượng mới: " + book.getQty());
    }
}
