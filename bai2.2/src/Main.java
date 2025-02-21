public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Nguyen Van A", "nguyenvana@example.com", 'M');
        Author author2 = new Author("Tran Thi B", "tranthib@example.com", 'F');

        Author[] authors = {author1, author2};

        Book book = new Book("Lập trình Java", authors, 150.0, 10);

        System.out.println(book);

        System.out.println("Tên sách: " + book.getName());
        System.out.println("Giá sách: " + book.getPrice());
        System.out.println("Số lượng tồn kho: " + book.getQty());

        book.setPrice(200.0);
        book.setQty(20);

        System.out.println("Giá mới: " + book.getPrice());
        System.out.println("Số lượng mới: " + book.getQty());

        System.out.println("Danh sách tác giả: " + book.getAuthorNames());
    }
}
