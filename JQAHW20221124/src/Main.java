public class Main {
    public static void main(String[] args) {
//        1. Создать иерархию классов геометрических фигур
//        Должны быть следующие классы
//        Figure, Square, Circle, Triangle, Rectangle
//        (Фигура, квадрат, круг, треугольник, прямоугольник)
//        У каждой фигуры должен быть метод public void show(), который распечатывает сообщение, какая именно фигура, например, "I'm a square!"
//        Создать каждую фигуру и вызвать метод.
        Square square = new Square();
        square.show();

        Circle circle = new Circle();
        circle.show();

        Triangle triangle = new Triangle();
        triangle.show();

        Rectangle rectangle = new Rectangle();
        rectangle.show();

        System.out.println("================================");
        /*--------------------------------------------------------------------------------------*/
//        Создать абстрактный класс Ingredient с полем quantity, геттером, сеттром, абстрактным методом long calculateQuantityFor100Gramm() (сколько грамм сырого продукта нужно, чтобы получить 100 грамм после приготовления) ``.
//        Создать подклассы конкретных ингредиентов (не менее трёх), например, Noodle, Pork, Mushroom. В реализации асбтрактного метода выводить на печать имя ингредиента

        Noodle noodle = new Noodle(600);
        noodle.calculateQuantityFor100Gramm();

        Pork pork = new Pork(500);
        pork.calculateQuantityFor100Gramm();

        Mushroom mushroom = new Mushroom(2000);
        mushroom.calculateQuantityFor100Gramm();

        System.out.println("================================");
    }
}