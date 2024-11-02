public class CustomerTest {
    public static void main(String[] args) {
        Customer c1 = new Customer(88, "Tah Ah Teck", 10);
        System.out.println(c1);

        c1.setDiscount(8);
        System.out.print(c1);
        System.out.println("id is: " + c1.getId());
        System.out.println("Name is: " + c1.getName());
        System.out.println("discount is " + c1.getDiscount());

        Invoice inv1 = new Invoice(101, c1, 888.8);
        System.out.println(inv1);

        inv1.setAmmount(999.9);
        System.out.println(inv1);
        System.out.println("id is: " + inv1.getId());
        System.out.println("Customer is: " + inv1.getCustomer());
        System.out.println("ammount is: " + inv1.getAmmount());
        System.out.println("Customer`s id is: " + inv1.getCustomerId());
        System.out.println("Customer`s name is: " + inv1.getCustomerName());
        System.out.println("Customer`s discount is: " + inv1.getCustomerDiscount());
        System.out.printf("ammount after discount is: %.2f%n", inv1.getAmountAfterDiscount());
    }
}