

public class Main {
    public static void main(String[] args) {
        Author a1 = new Author("Tan Ah Teck", "ahteck@gmail.com");
        System.out.println(a1);

        a1.setEmail("ahteck@yahoo.com");
        System.out.print(a1);
        System.out.println("name is: " + a1.getName());
        System.out.println("email is " + a1.getEmail());

        Book b1 = new Book("12345", "Java for Dummies", a1, 8.8, 88);
        System.out.println(b1);

        b1.setPrice(9.9);
        b1.setQty(99);
        System.out.println("Isbn is: " + b1.getIsbn());
        System.out.println("name is: " + b1.getName());
        System.out.println("price is : " + b1.getPrice());
        System.out.println("author is: " + b1.getAuthor());
        System.out.println("Author`s name is: " + b1.getAuthorName());
        System.out.println("Author`s name is:" + b1.getAuthor().getName());
        System.out.println("Author`s email is: " + b1.getAuthor().getEmail());
    }
}
