public class Invoice {
    int id;
    Customer customer;
    double ammount;

    public Invoice(int id, Customer customer, double ammount) {
        this.id = id;
        this.customer = customer;
        this.ammount = ammount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer newcustomer) {
        this.customer = newcustomer;
    }

    public double getAmmount() {
        return ammount;
    }

    public void setAmmount(double newammount) {
        this.ammount = newammount;
    }

    public int getCustomerId() {
        return customer.id;
    }

    public String getCustomerName() {
        return customer.name;
    }

    public int getCustomerDiscount() {
        return customer.discount;
    }

    public double getAmountAfterDiscount() {
        return ammount - ((ammount / 100) * customer.discount);
    }

    @Override
    public String toString() {
        return "Invoice[id= " + id + customer + ",ammount= " + ammount + "]";
    }
}
