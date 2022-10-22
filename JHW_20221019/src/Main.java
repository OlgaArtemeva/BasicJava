//1. 	Представьте, вы пишите программу для автопарка или, например, для авиакомпании. Вам необходимо  создать класс Ticket , который должен содержать следующие поля Route route, MyDateTime time, double price. Как вы догадываетесь, Route и MyDateTime тоже классы: Route{String number, String from, String destination, long distance} MyDateTime (day,month,year,hour,min). Далее вам необходимо:
//        a) создать несколько разных билетов, положить их в массив.
//        b) Реализовать метод, который выводит информацию обо всех билетах
//        c) Реализовать метод, который считает суммарную стоимость билетов.
//        d) Необходимо посчитать суммарную дистанцию всех маршрутов (предположим, что у вас нет билетов с одним и тем же маршрутом, т.е. задача сводится к простому суммированию всех distance)
//        e) Реализовать в билете метод изменения времени отправления.



//---------------------------------------------------------------------------//
// Андрей, большое Вам спасибо за лекции и подробное обьяснение материала!
//
// Честно коворя, запуталась, какой метод в этом примере в каком классе лучше
// реализовать и когда методу следует прописывать модификатор 'static'.
// Надеюсь, получится просмотреть Ваши новые лекции и разобраться.
//---------------------------------------------------------------------------//

public class Main {

    public static void main(String[] args) {

        //        a) создать несколько разных билетов, положить их в массив.
        Ticket[] tickets= {
                new Ticket(new Route("12", "Yaroslawl", "Moskow", 300),
                        new MyDateTime(1, 1, 2023, 10, 23), 700.24),
                new Ticket(new Route("15", "Moskow", "Berlin", 1816),
                        new MyDateTime(1, 1, 2023, 23, 00), 2700.00),
                new Ticket(new Route("9", "Rostow", "St.Petersburg", 1788),
                        new MyDateTime(9, 5, 2022, 8, 10), 2100.50),
                new Ticket(new Route("17", "St.Petersburg", "Berlin", 1748),
                        new MyDateTime(11, 5, 2022, 14, 00), 2600.50)

        };

        outputTicketIn(tickets);  //выводим информацию обо всех билетах
        System.out.println("------------------------");

        sumTicketPrice(tickets);  //считаем суммарную стоимость билетов
        System.out.println("------------------------");

        sumDistance(tickets);  //считаем суммарную дистанцию всех маршрутов
        System.out.println("------------------------");

        tickets[0].setTime(23,59);  //изменяем временя отправления
        tickets[0].print();
 }

 //        b) Реализовать метод, который выводит информацию обо всех билетах
public static void outputTicketIn(Ticket[] tickets) {
    for (Ticket t : tickets) {
        System.out.println(t);
    }
}

//        c) Реализовать метод, который считает суммарную стоимость билетов.
    public static void sumTicketPrice(Ticket[] tickets) {
        double sum = 0;
        for (Ticket t : tickets) {
            sum+= t.getPrice();
        }
        System.out.println("Cуммарная стоимость билетов: " + sum);
    }

    //        d) Необходимо посчитать суммарную дистанцию всех маршрутов
    public static void sumDistance(Ticket[] tickets){
        double sum = 0;
        for (Ticket t : tickets) {
            sum+= t.getRouteDistance();
        }
        System.out.println("Cуммарная дистанция всех маршрутов: " + sum);
    }
}