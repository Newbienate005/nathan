public class InvoiveItemTest {
    public static void main(String[] args) {
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        System.out.println(inv1);

        inv1.setQty(999);
        inv1.setUnitPrice(0.99);
        System.out.println(inv1);
        System.out.println("the id is: " + inv1.getId());
        System.out.println("The description is: " + inv1.getDesc());
        System.out.println("The quantity is: " + inv1.getQty());
        System.out.println("The unit price is: " + inv1.getUnitPrice());
    }
}
