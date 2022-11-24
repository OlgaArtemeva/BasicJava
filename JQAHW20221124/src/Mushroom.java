public class Mushroom  extends Ingredient{
    public Mushroom(int quantity) {
        super(quantity);
    }

    @Override
    public long calculateQuantityFor100Gramm() {
        System.out.println("Ingredient is Mushroom. Quantity "+ getQuantity() + "g. For 100g of finished product you need 300g of raw.");
        return  300;
    }
}
