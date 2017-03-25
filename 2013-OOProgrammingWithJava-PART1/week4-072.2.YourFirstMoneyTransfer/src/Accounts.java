
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account matts = new Account("Matt's account", 1000.0);
        Account mine = new Account("My account", 0.0);
        matts.withdrawal(100.0);
        mine.deposit(100.0);
        System.out.println(matts.toString());
        System.out.println(mine.toString());
    }
}
