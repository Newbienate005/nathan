public class Account {
    int id;
    Customer customer;
    double balance = 0.0;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newbalance) {
        this.balance = newbalance;
    }

    @Override
    public String toString() {
        return "" + customer + balance;
    }

    public String getCustomerName() {
        return customer.name;
    }

    public double deposit(double amount) {
        return amount + balance;
    }

    public double withdraw(double amount) {
        if (balance >= amount) {
            return balance - amount;
        } else {
            return 1;
        }
    }
}
