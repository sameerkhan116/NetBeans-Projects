
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sameerkhan
 */
public class Contact {
    private String contactName;
    private List<String> contactNumber;
    private List<String> contactAddress;
    
    public Contact(String name) {
        this.contactName = name;
    }
    
    public void addNumber(List<String> number) {
        this.contactNumber = number;
    }
    
    public void addAddress(List<String> address) {
        this.contactAddress = address;
    }
    
    public String getName() {
        return this.contactName;
    }
    
    public List<String> getNumber() {
        return this.contactNumber;
    }
    
    public List<String> getAddress() {
        return this.contactAddress;
    }
}
