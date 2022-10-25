public class Сellphone extends Elektronik {
    double operatorContractPrice;

    public Сellphone(String name, double price, double priceGuarantee, double operatorContractPrice) {
        super(name, price, priceGuarantee);
        this.operatorContractPrice = operatorContractPrice;
    }

    public void buy() {
        System.out.println("Product: " + name + ", purchase invoice: " + price + ", guarantee price: " + priceGuarantee + ", operator contract price: " + operatorContractPrice);
    }
}
