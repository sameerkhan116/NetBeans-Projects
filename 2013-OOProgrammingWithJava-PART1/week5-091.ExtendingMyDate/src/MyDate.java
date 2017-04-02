public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    private MyDate(int days) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        // first we'll compare years
        if ( this.year < compared.year ) {
            return true;
        }

        // if the years are the same, we'll compare the months
        if ( this.year == compared.year && this.month < compared.month ) {
            return true;
        }

        // years and months the same, we'll compare the days
        if ( this.year == compared.year && this.month == compared.month &&
                this.day < compared.day ) {
            return true;
        }

        return false;
    }
    
    public void advance() {
        this.day += 1;
        if(this.day > 30) {
            this.day = 1;
            this.month += 1;
            if(this.month > 12) {
                this.month = 1;
                this.year += 1;
            }
        }
    }
    
    public void advance(int numberOfDays) {
        for(int i = 0; i < numberOfDays; i++) {
            this.advance();
        }
    }
    
    public MyDate afterNumberOfDays(int days) {
        MyDate mydate = new MyDate(this.day, this.month, this.year);
        mydate.advance(days);
        return mydate;      
    }
}