package Scool;

public class MyDate {
    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return ", birthday: " + day + "/" + month + "/" + year;
    }
    public void print() {
        System.out.println(toString());
    }
}
