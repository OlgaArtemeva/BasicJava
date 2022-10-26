//Создать класс Employee со следующими переменными:
//private int id;
//private String firstName;
//private String lastName;
//private int age;
//private String gender;
//private String position;
//        Класс должен содержать конструктор, геттеры, сеттеры ,метод toString
//        а также метод  public String getFullName().
//        Создать и вывести на экран несколько обьектов этого класса

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String position;

    public Employee(int id, String firstName, String lastName, int age, String gender, String position) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.position = position;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String toString() {
        return id + ": " + firstName + " " + lastName + ", " + age + " лет, пол: " + gender + ", должность: " + position;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

}
