public abstract class Ingredient {
    private int quantity;

    public Ingredient(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract long calculateQuantityFor100Gramm();
}
