
import java.util.Calendar;


public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public int differenceInYears(MyDate comparedDate) {
        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        int diffinDays = 0;
        int days;
            calendar1.set(this.year, this.month, this.day);
            calendar2.set(comparedDate.year, comparedDate.month, comparedDate.day);

            long daysfor1 = calendar1.getTimeInMillis();
            long daysfor2 = calendar2.getTimeInMillis();

            long diffdays = Math.abs(daysfor1 - daysfor2);

            diffinDays = (int) (diffdays / (24*60*60*1000));
            
        return (diffinDays + (Math.abs(this.year - comparedDate.year)/4)) / 365;
    }

}