public class BookTest {
    public static void main(String[] args) {
        Author ahTeck = new Author("Tan Ah Teck", "ahteck.gmail.com", 'm');
        System.out.println(ahTeck);
        Book dummyBook = new Book("Java for dummies", ahTeck, 19.95, 99);
        System.out.println(dummyBook);

        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("Name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.print("qty is: " + dummyBook.getQty());
        System.out.println("author is: " + dummyBook.getAuthor());
        System.out.println("author`s name is: " + dummyBook.getAuthor().getName());
        System.out.println("author`s email is: " + dummyBook.getAuthor().getEmail());
    }
}
