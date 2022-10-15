//        1. Создать класс "Rectangle" , предоставляющий возможность вычисления площади и периметра
// прямоугольника. area= length*breadth;  perimeter= 2*(length+breadth). Длина и ширина
// передаются как параметры конструктора. Создать несколько обьектов этого класса и вывести их на экран
public class Rectangle {
    int length;
    int breadth;

    public void print () {
        System.out.println("прямоугольник " + length + " X " + breadth);
        System.out.println("площадь прямоугольника: "+ length*breadth);
        System.out.println("периметр прямоугольника: " + 2*(length+breadth));
    }
}
