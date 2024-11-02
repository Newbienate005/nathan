class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    public void credit(int amount) {
        balance += amount;
    }

    public void debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
    }

    public void transferTo(Account another, int amount) {
        if (amount <= balance) {
            debit(amount);
            another.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return String.format("Account[id=%s,name=%s,balance=%d]", id, name, balance);
    }
}