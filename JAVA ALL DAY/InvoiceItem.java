public class InvoiceItem {
    String id;
    String desc;
    int qty;
    double unitPrice;

    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int newqty) {
        this.qty = newqty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double newunitprice) {
        this.unitPrice = newunitprice;
    }

    @Override
    public String toString() {
        return "Item id is: " + id + "item`s description is: " + desc + "Item`s quantity is: " + qty
                + "Items`s unit price is: " + unitPrice;
    }
}
