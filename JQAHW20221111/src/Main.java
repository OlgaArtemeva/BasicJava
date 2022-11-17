public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setFullName("John");
        person1.setAge(30);

        Person person2 = new Person("Ivan",20);
        person2.setFullName("Vano");
        person2.setAge(21);

        person1.move();
        person1.talk();

        person2.move();
        person2.talk();

        System.out.println("---------------------------------------------------------");

        Phone phone1 = new Phone("122345675879", "Motorola", 4);
        Phone phone2 = new Phone("103890456345", "Samsung", 5);
        Phone phone3 = new Phone("100984633213", "iPhone", 7);

        phone1.printObjectToScreen();
        phone2.printObjectToScreen();
        phone3.printObjectToScreen();

        System.out.println("---------------------------------------------------------");

        phone1.receiveCall("Anna");
        System.out.println(" (" + phone1.number + ").");
        phone2.receiveCall("Janna");
        System.out.println(" (" + phone2.number + ").");
        phone3.receiveCall("Katya");
        System.out.println(" (" + phone3.number + ").");
    }
}