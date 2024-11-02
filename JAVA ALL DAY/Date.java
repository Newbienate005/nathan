public class Date {
    int day;
    int month;
    int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int newday) {
        this.day = newday;
    }

    public void setMonth(int newmonth) {
        this.month = newmonth;
    }

    public void setYear(int newyear) {
        this.year = newyear;
    }

    public void setDate(int newday, int newmonth, int newyear) {
        this.day = newday;
        this.month = newmonth;
        this.year = newyear;
    }

    @Override
    public String toString() {
        return getDay() + "/" + getMonth() + "/" + getYear();
    }
}