package Scool;

public class Learner {
    String name;
    String surname;
    int classNumber;
    double averageRating;
    MyDate birthday;

    public Learner(String name, String surname, int classNumber, double averageRating, MyDate birthday) {
        this.name = name;
        this.surname = surname;
        this.classNumber = classNumber;
        this.averageRating = averageRating;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return name + surname + ", class: " + classNumber +
                ", averageRating: " + averageRating;
    }

//    public void print() {
//        System.out.println(toString());
//    }

    public double getAverageRating() {
        return averageRating;
    }
}
