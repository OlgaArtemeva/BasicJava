//Создать класс "Employee", имеющий:
// - конструктор, который принимает переменные salary, number of  employee's working hours в качестве параметров
// - следующие методы: addSalary() , который добавляет 10 евро к зврплате сотрудника если она меньше 500
// и addWork() , добавляющий 5 евро к зарплате сотрудника если количество часов  больше 6.
// Создать несколько сотрудников и применить к ним методы

public class Employee {
    int salary;
    int numOfEmployeeWorkHour;


    public Employee(int salary, int numOfEmployeeWorkHour) {
        this.salary = salary;
        this.numOfEmployeeWorkHour = numOfEmployeeWorkHour;
    }


    public int addSalary() {
        if (salary < 500) {
            salary = salary + 10;
        }
        return salary;
    }

    public int addWork(){
        if (numOfEmployeeWorkHour<6){
            salary=salary+5;
        }
        return salary;
    }
}
