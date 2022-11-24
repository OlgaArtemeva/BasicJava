public class Pork  extends Ingredient{
    public Pork(int quantity) {
        super(quantity);
    }

    @Override
    public long calculateQuantityFor100Gramm() {
        System.out.println("Ingredient is Pork. Quantity "+ getQuantity() + "g. For 100g of finished product you need 120g of raw.");

        return  120;
    }
}
