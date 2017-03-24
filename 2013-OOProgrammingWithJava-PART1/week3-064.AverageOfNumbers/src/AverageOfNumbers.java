
import java.util.ArrayList;

public class AverageOfNumbers {

    // Copy here the method sum from previous assignment
    public static int sum(ArrayList<Integer> list) {
        int result = 0, i = 0;
        while(i < list.size()) {
            result += list.get(i);
            i++;
        }
        return result;
    }
    
    public static double average(ArrayList<Integer> list) {
        double average = 0, i = 0;
        int size = list.size();
        double sum = (double)sum(list);
        while(i < list.size()) {
            average = sum/size;
            i++;
        }
        return average;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}