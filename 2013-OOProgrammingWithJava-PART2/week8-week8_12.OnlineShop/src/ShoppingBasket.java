import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sameerkhan
 */
public class ShoppingBasket {
    private Map<String,Purchase> basket;
    
    public ShoppingBasket() {
        this.basket = new HashMap<String, Purchase>();
    }
    
    public void add(String product, int price) {
        if(this.basket.containsKey(product)) {
            this.basket.get(product).increaseAmount();
        } else {
            Purchase e = new Purchase(product, 1, price);
            this.basket.put(product, e);
        }
    }
    
    public int price() {
        int amount = 0;
        for(Purchase e : this.basket.values()) {
            amount += e.price();
        }
        return amount;
    }
    
    public void print() {
        String str = "";
        for(Purchase e: this.basket.values()) {
            System.out.println(e);
        }
    }
    
}