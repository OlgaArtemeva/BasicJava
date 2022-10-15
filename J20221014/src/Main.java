public class Main {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        r1.length = 2;
        r1.breadth = 3;
        r1.print();
        System.out.println("------------------------");

        Average av1 = new Average();
        av1.a = 1;
        av1.b = 3;
        av1.c = 4;
        av1.print();
        System.out.println("------------------------");

        Employee emp1 = new Employee(450, 160);
        Employee emp2 = new Employee(600, 5);

        System.out.println("Расчет по з/п " + emp1.salary + " :" + emp1.addSalary());
        System.out.println("Расчет по  з/п " + emp2.salary + " :" + emp2.addSalary());

        System.out.println("Расчет по количеству рабочих часов " + emp1.numOfEmployeeWorkHour + " :" + emp1.addWork());
        System.out.println("Расчет по количеству рабочих часов " + emp2.numOfEmployeeWorkHour + " :" + emp2.addWork());
        System.out.println("------------------------");

        Body person1 = new Body(45, 1.6);
        Body person2 = new Body(48, 1.58);
        Body person3 = new Body(75, 1.7);
        Body person4 = new Body(120, 1.68);

        person1.countBMI();
        person2.countBMI();
        person3.countBMI();
        person4.countBMI();
        System.out.println("------------------------");



    }
}