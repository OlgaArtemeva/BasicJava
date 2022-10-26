public class Main {
    public static void main(String[] args) {
        Employee p1 = new Employee(1, "Andrey", "Sergeev", 35, "М", "engineer");
        Employee p2 = new Employee(2, "Ivan", "Petrov", 40, "М", "programmer");
        Employee p3 = new Employee(3, "Elena", "Svetlova", 25, "W", "engineer");


        Employee[] employees = {p1, p2, p3};
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

        System.out.println();
        System.out.println("Полные имена:");
        for (Employee employee : employees) {
            employee.setPosition("тестировщиком");
            System.out.println(employee.getFullName() + " (" + employee.getFirstName() + " + " +
                    employee.getLastName() + "), стал " + employee.getPosition());
        }
    }
}