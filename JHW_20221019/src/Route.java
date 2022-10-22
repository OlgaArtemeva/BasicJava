//Route{String number, String from, String destination, long distance}
public class Route {
    private String number;
    private String from;
    private String destination;
    private long distance;

    public Route(String number, String from, String destination, long distance) {
        this.number = number;
        this.from = from;
        this.destination = destination;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "number " + number +
                ", from " + from +
                " to " + destination + ", distance: " + distance;
    }

    public long getDistance() {
        return distance;
    }
}
