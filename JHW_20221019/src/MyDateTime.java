//MyDateTime (day,month,year,hour,min)
public class MyDateTime {
    private int day;
    private int month;
    private int year;
    private int hour;
    private int min;

    public MyDateTime(int day, int month, int year, int hour, int min) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.min = min;
    }

    @Override
    public String toString() {
        return ", date: " + day + "/" + month + "/" + year + " " + hour + ":" + min;
    }

    //        e) Реализовать в билете метод изменения времени отправления.
    public void setHour(int hour) {
        if (hour>=0 && hour<24) {
            this.hour = hour;
        }
    }
    public void setMin(int min) {
        if (min>=0 && min<60) {
            this.min = min;
        }
    }
}
