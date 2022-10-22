package Scool;

public class Subject {
    String teacherSurname;
    String subject;

    public Subject(String teacherSurname, String subject) {
        this.teacherSurname = teacherSurname;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return subject + " (" + teacherSurname + ")";
    }
    public void print() {
        System.out.println(toString());
    }
}
