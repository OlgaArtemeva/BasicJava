//Создать метод, вычисляющий индекс массы тела (BMI)  и  печатающий результат:
// Метод использует вес в килограммах и рост в метрах.  .
// Метод должен быть в классе Body и выодить следующее сообщение:
//"Underweight" если BMI  меньше 18.5
// "Normal" if 18.5<=BMI<25
// "Overweight" 25<=BMI<30
// Obese  BMI>=30
// формула для расчета BMI = weight/height*height

//вес и рост передаются через конструктор

public class Body {
    int weight;
    double height;

    public Body(int weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public void countBMI() {
        double BMI = weight / (height * height);
        if (BMI < 18.5) {
            System.out.println("Underweight");
        }
        if (18.5 <= BMI && BMI < 25) {
            System.out.println("Normal");
        }
        if (25 <= BMI && BMI < 30) {
            System.out.println("Overweight");
        }
        if (BMI > 30) {
            System.out.println("Obese");
        }
    }
}
