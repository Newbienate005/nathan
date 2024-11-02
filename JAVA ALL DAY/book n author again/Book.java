public class Book {
    String isbn;
    String name;
    Author author;
    double price;
    int qty = 0;

    public Book(String isbn, String name, Author author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String isbn, String name, Author author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newprice) {
        this.price = newprice;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int newqty) {
        this.qty = newqty;
    }

    public String getAuthorName() {
        return author.getName();
    }

    @Override
    public String toString() {
        return "Book[isbn= " + isbn + author + ", Price= " + price + "quantity = " + qty;
    }
}
