import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] student = {"Вася", "Петя", "Маша", "Таня", "Марк"};
        double[] rating = {4.4, 4.0, 5.0, 3.0, 4.1};
        System.out.println(bestStudent(student, rating));
        System.out.println("--------------------------");

        double grade = 3.0;
        System.out.println(studentRating(student, rating, grade));
    }

    //    Дано 2 массива. Первый массив String[] содержит имена студентов. Второй массив double[] содержит средний балл студентов. i-й элемент первого массива соответствует i-элементу второго массива. Длины массивов равны. Необходимо написать метод, который возвращает имя самого успешного студена. В данной задаче, если 2 и более студента имеют лучший бал, метод может вернуть имя любого из них.
    public static String bestStudent(String[] student, double[] rating) {
        String name = null;
        double[] ratingCopy = Arrays.copyOf(rating, rating.length);
        Arrays.sort(ratingCopy, 0, rating.length);
        for (int i = 0; i < rating.length; i++) {
            if (rating[i] == ratingCopy[rating.length - 1]) {
                name = student[i];
                break;
            }
        }
        return name;
        //хотела в стр. 21 написать "return name = student[i];" b и убрать "break;", ножно ли тогда как-то избавиться от "return name;" в 25 строке?
    }

//  Исходные условия как у предыдущей задачи, т.е. дано два массива один с именами другой с средним баллом, но ваш метод должен выдавать строку вида имя1 - балл1:имя2 - балл2:имя3 - балл3 ….для всех студентов, чей балл выше заданного значения. Например:
//    {“Jack”, “John”, “Stan”, “Ed”}, {3.5, 4.2, 4.8, “4.1”}, 4.0 ->
//            “John - 4.2:Stan - 4.8:Ed - 4.1”

    public static String studentRating(String[] student, double[] rating, double grade) {
        String str = "";

        for (int i = 0; i < student.length; i++) {
            if (rating[i] > grade) {
                str = str + student[i] + " - " + rating[i] + ":";
            }
        }
        str = str.substring(0, str.length() - 1);
        return str;
    }
}