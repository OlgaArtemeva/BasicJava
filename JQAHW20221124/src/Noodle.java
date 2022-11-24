public class Noodle extends Ingredient{

    public Noodle(int quantity) {
        super(quantity);
    }

    @Override
    public long calculateQuantityFor100Gramm() {
        System.out.println("Ingredient is noodle. Quantity "+ getQuantity() + "g. For 100g of finished product you need 50g of raw.");

        return  50;
    }
}

