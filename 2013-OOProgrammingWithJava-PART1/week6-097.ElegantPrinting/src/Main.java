
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        // Write code here
        String str1 = "";
        for(int i = 0; i < array.length - 1; i++) {
            str1 += array[i] + ", ";
        }
        System.out.println(str1 + array[array.length - 1]);

    }
}
