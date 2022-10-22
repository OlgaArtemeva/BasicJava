package Scool;

public class MainSchool {
    public static void main(String[] args) {
Learner[] learners= {
        new Learner("Peter", "Ivanov", 1, 4.2,
                     new MyDate(01, 10, 2015)),
        new Learner("Maya", "Sidorova", 1, 5.0,
                new MyDate(11, 12, 2015)),
        new Learner("Ivan", "Ivanov", 6, 4.0,
                new MyDate(07, 03, 2010)),
        new Learner("Peter", "Sinicin", 11, 4.6,
                new MyDate(10, 02, 2000))
};

Subject[] subjects = {
        new Subject("Pushkareva", "reading"),
        new Subject("Pushkareva", "maths"),
        new Subject("Myasnikova", "literature"),
        new Subject("Vinogradova", "algebra"),
};

        outputTicketIn(learners);
        System.out.println("------------------------");

        outputTicketIn(subjects);
        System.out.println("------------------------");

        System.out.println("School average: " + String.format("%.2f",schoolAverageRating(learners)));
        System.out.println("------------------------");

    }

    // вывод списка учеников
    public static void outputTicketIn(Learner[] learners) {
        for (Learner l: learners) {
            System.out.println(l);
        }
    }

    // вывод списка школьных предметов
    public static void outputTicketIn(Subject[] subjects) {
        System.out.println("List of school subjects:");
        System.out.println();
        for (Subject s: subjects) {
            System.out.println(s);
        }
    }

    // вывод среднего школьного балла
   public static double schoolAverageRating(Learner[] learners){
       double schoolAverageRating=0;
        for (Learner l: learners){
            schoolAverageRating+=l.getAverageRating();
        }
       return schoolAverageRating= schoolAverageRating/learners.length;
   }

}
