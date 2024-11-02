public class Customer {
    int id;
    String name;
    int discount;

    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int newdiscount) {
        this.discount = newdiscount;
    }

    @Override
    public String toString() {
        return "Customer name is " + name + " Customer id is " + id + " Customer discount is " + discount;
    }
}
