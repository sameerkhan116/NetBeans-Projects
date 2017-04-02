
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
        if(!this.earlier(comparedDate)) {
            int diff = this.year - comparedDate.year;
                if (this.month < comparedDate.month || this.month == comparedDate.month && this.day < comparedDate.day) {
                diff--;
                }
                return diff;
        } else {
            int diff = comparedDate.year - this.year;
            if (this.month > comparedDate.month || comparedDate.month == this.month && this.day > comparedDate.day) {
            diff--;
            }
            return diff;
        }
    }
}