
//Вам необходимо создать класс Ticket , который должен содержать следующие поля Route route, MyDateTime time, double price. Как вы догадываетесь, Route и MyDateTime тоже классы: Route{String number, String from, String destination, long distance} MyDateTime (day,month,year,hour,min).

public class Ticket {
    private Route route;
    private MyDateTime time;
    private double price;

    public Ticket(Route route, MyDateTime time, double price) {
        this.route = route;
        this.time = time;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ticket " + route + time + ", price: " + price + '.';
    }

    public void print() {
        System.out.println(toString());
    }

    public double getPrice() {
        return price;
    }

    public static void sumDistance(Ticket[] tickets) {
        double sum = 0;
        for (Ticket t : tickets) {
            sum += t.route.getDistance();

        }
        System.out.println("Cуммарная дистанция всех маршрутов: " + sum);
    }

    public long getRouteDistance() {
        return route.getDistance();
    }

    public void setTime(int hour, int min) {
        this.time.setHour(hour);
        this.time.setMin(min);

    }
}
