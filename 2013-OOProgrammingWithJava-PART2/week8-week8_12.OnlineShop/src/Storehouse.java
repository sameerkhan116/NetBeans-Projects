import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sameerkhan
 */
public class Storehouse {
    private Map<String, Integer> products;
    private Map<String, Integer> stocks;
    
    public Storehouse() {
        this.products = new HashMap<String, Integer>();
        this.stocks = new HashMap<String, Integer>();
    }
    
    public void addProduct(String product, int price, int stock) {
        this.products.put(product, price);
        this.stocks.put(product, stock);
    }
    
    public int price(String product) {
        if(this.products.containsKey(product)) {
            return this.products.get(product);
        } 
        return -99;
    }
    
    public int stock(String product) {
        if(this.stocks.containsKey(product)) {
            return this.stocks.get(product);
        }
        return 0;
    }
    
    public boolean take(String product) {
        int buffer = 0;
        if(this.stocks.containsKey(product)) {
            buffer = this.stocks.get(product);
            if(buffer > 0) {
                buffer--;
                this.stocks.put(product, buffer);
                return true;
            }
            return false; 
        }
        return false;
    }
    
    public Set<String> products() {
        Set<String> prods = this.stocks.keySet();
        return prods;
    }
    
}