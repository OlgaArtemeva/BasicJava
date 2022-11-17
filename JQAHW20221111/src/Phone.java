public class Phone {

    String number;
    String model;
    int weight;

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void printObjectToScreen() {
        System.out.println("The object number is " + this.number + ", the object model is " + this.model + ", the object weight is " + this.weight + ".");
    }

    public void receiveCall(String name) {
        System.out.print("Звонит " + name);
    }

    public String getNumber() {
        return number;
    }
}
