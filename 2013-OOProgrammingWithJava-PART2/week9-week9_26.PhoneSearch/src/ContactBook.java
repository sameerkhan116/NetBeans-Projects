
import java.util.ArrayList;
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
public class ContactBook {
    private List<Contact> contactBook;
    private Contact contact;
    
    public ContactBook() {
        this.contactBook = new ArrayList<Contact>();
    }
    
    public void addContact(String name) {
        this.contact = new Contact(name);
        
        if(!contactBook.contains(this.contact)) {
            this.contactBook.add(contact);
        }
    }
    
    public List<Contact> getContacts() {
        return this.contactBook;
    }
}
