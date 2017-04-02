import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    
    public Person(String name) {
        this.name = name;
        int d = Calendar.getInstance().get(Calendar.DATE);
        int m = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int y = Calendar.getInstance().get(Calendar.YEAR);
        this.birthday = new MyDate(d,m,y);
    }
    
    public int age() {
        int d = Calendar.getInstance().get(Calendar.DATE);
        int m = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int y = Calendar.getInstance().get(Calendar.YEAR);
        MyDate curr = new MyDate(d,m,y);
        return this.birthday.differenceInYears(curr);
    }
    
    public boolean olderThan(Person compared) {
        if(this.birthday.earlier(compared.birthday)) {
            return true;
        }
        return false;
    }
    
    public String getName() {
        return this.name;
    }
    
    @Override
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
