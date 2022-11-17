public class Person {
    String fullName;
    int age;

    public Person() {}

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    // В чем разница между this.age и age?
    public void move() {

        System.out.print(this.fullName + " говорит :");
    }


    public void talk() {
        System.out.println(" \"Мне " + age + " лет\".");
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
