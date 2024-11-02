public class Book {
    String name;
    Author author;
    double price;
    int qty;

    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
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

    @Override
    public String toString() {
        return "Book [name= " + name + author + ", Price= " + price + ", quantity =" + qty;
    }
}
