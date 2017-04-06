
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }
    
    public Money plus(Money added) {
        int a = added.euros();
        int b = added.cents();
        Money addition = new Money(this.euros + a, this.cents + b);
        return addition;
    }
    
    public boolean less(Money compared) {
        return (this.euros*100 + this.cents%100) < (compared.euros() * 100 + compared.cents() % 100); 
    }

    public Money minus(Money decremented) {
        int a = decremented.euros();
        int b = decremented.cents();
        Money subtracted;
        if(this.cents - b < 0) {
            subtracted = new Money(this.euros() - a - 1, 100 - b);
        } else {
            subtracted = new Money(this.euros - a, this.cents - b);
        }
        Money zero = new Money(0,0);
        if(this.euros - decremented.euros() < 0 || (this.euros == decremented.euros() && this.cents < decremented.cents())) {
            return zero;
        } else {
        return subtracted;
        }
    }
    
    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
