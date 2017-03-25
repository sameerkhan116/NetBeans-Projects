public class DecreasingCounter {
    private int value;  // instance variable that remembers the value of the counter
    private int ogvalue;
    
    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.ogvalue = valueAtStart;
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        this.value--;
        if(this.value < 0) {
            this.value = 0;
        }
    }
    
    public void reset() {
        this.value = 0;
    }
    
    public void setInitial() {
        this.value = this.ogvalue;
    }
    
    

    // and here the rest of the methods
}
