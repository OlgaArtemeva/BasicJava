public class Elektronik extends Product {
    double priceGuarantee;

    public Elektronik(String name, double price, double priceGuarantee) {
        super(name, price);
        this.priceGuarantee = priceGuarantee;
    }

    public void buy() {
        System.out.println("Product: " + name + ", purchase invoice: " + price + ", guarantee price: " + priceGuarantee);
    }
}
