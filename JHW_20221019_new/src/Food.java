public class Food extends Product {
    private double priceUrgency;

    public Food(String name, double price, double priceUrgency) {
        super(name, price);
        this.priceUrgency = priceUrgency;
    }

    public void buy() {
        System.out.println("Product: " + name + ", purchase invoice: " + price + ", price for urgent delivery: " + priceUrgency);
    }
}
