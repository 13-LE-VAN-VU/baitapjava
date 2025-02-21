public class Main {
    public static void main(String[] args) {
        Author author = new Author("Nguyen Van A", "nguyenvana@example.com", 'M');

        System.out.println(author);

        author.setEmail("van.a@domain.com");
        System.out.println("Email mới: " + author.getEmail());

        System.out.println("Tên tác giả: " + author.getName());
        System.out.println("Giới tính: " + author.getGender());
    }
}
