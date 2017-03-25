public class Main {

    public static void main(String[] args) {
        // add here code that tests LyraCard. However before doing 77.6 remove the
        // other code 
        LyyraCard Pekka = new LyyraCard(20);
        LyyraCard Brian = new LyyraCard(30);
        
        Pekka.payGourmet();
        Brian.payEconomical();
        
        System.out.print("Pekka: ");
        System.out.println(Pekka.toString());
        
        System.out.print("Brian: ");
        System.out.println(Brian.toString());
        
        Pekka.loadMoney(20);
        Brian.payGourmet();
        
        System.out.print("Pekka: ");
        System.out.println(Pekka.toString());
        
        System.out.print("Brian: ");
        System.out.println(Brian.toString());
        
        Pekka.payEconomical();
        Pekka.payEconomical();
        
        Brian.loadMoney(50);
        
        System.out.print("Pekka: ");
        System.out.println(Pekka.toString());
        
        System.out.print("Brian: ");
        System.out.println(Brian.toString());
    }
}
