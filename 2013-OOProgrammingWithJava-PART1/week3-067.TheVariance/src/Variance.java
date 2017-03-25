import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int result = 0, i = 0;
        while(i < list.size()) {
            result += list.get(i);
            i++;
        }
        return result;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double avg;
        double total = sum(list);
        double x = list.size();
        avg = total/x;
        return avg;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double var, result = 0;
        int i = 0;
        double x = average(list);
        while(i < list.size()) {
            result += Math.pow(list.get(i) - x, 2);
            i++;
        }
        int varx = list.size() - 1;
        var = result/varx;
        return var;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
