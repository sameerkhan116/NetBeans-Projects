
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sameerkhan
 */
public class Operations {
    private ContactBook contactBook;
    private Scanner reader;
    
    public Operations(Scanner in) {
        this.contactBook = new ContactBook();
        this.reader = in;
    }
    
    public void input() {
        while(true) {
            String userInput;
            System.out.println("?");
            userInput = this.reader.nextLine();
            
            if(userInput.equalsIgnoreCase("x")) {
                break;
            } else if(userInput.equalsIgnoreCase("1")) {
                addNumber(this.reader, this.contactBook);
            } else if(userInput.equalsIgnoreCase("2")) {
                System.out.println("whose number: ");
                String inputName = this.reader.nextLine();
                searchNumber(inputName, this.contactBook);
            } else if(userInput.equalsIgnoreCase("3")) {
                System.out.println("number: ");
                String inputNumber = this.reader.nextLine();
                searchName(inputNumber, this.contactBook);
            } else if(userInput.equalsIgnoreCase("4")) {
                addAddress(this.reader, this.contactBook);
            } else if(userInput.equalsIgnoreCase("5")) {
                System.out.println("whose information: ");
                String inputName = this.reader.nextLine();
                searchNumberAndAddress(inputName, this.contactBook);
            } else if(userInput.equalsIgnoreCase("6")) {
                System.out.println("whose information: ");
                String inputName = this.reader.nextLine();
                deleteNumberAndAddress(inputName, this.contactBook);
            }
        }
    }
    
    public void addNumber(Scanner reader, ContactBook contactBook) {
        System.out.println("whose number:");
        String inputName = reader.nextLine();
        
        contactBook.addContact(inputName);
        
        System.out.println("number: ");
        String inputNumber = reader.nextLine();
        
        List<String> numberList = new ArrayList<String>();
        
        for(Contact c : contactBook.getContacts()) {
            if(c.getName().equalsIgnoreCase(inputName)) {
                if(c.getNumber() == null) {
                    numberList.add(inputNumber);
                    c.addNumber(numberList);
                    return;
                } else {
                    numberList = c.getNumber();
                    numberList.add(inputNumber);
                    c.addNumber(numberList);
                    return;
                }
            }
        }
    }
    
    public void searchNumber(String name, ContactBook contactBook) {
        for(Contact c : contactBook.getContacts()) {
            if(c.getName().equalsIgnoreCase(name)) {
                for(int i = 0; i < c.getNumber().size(); i++) {
                    System.out.println("[" + c.getNumber().get(i) + "]");
                }
                return;
            }
        }
        System.out.println("not found");
    }
    
    public void searchName(String number, ContactBook contactBook) {
        for(Contact c : contactBook.getContacts()) {
            if(c.getNumber().contains(number)) {
                System.out.println(c.getName());
                return;
            }
        }
        System.out.println("not found");
    }
    
    public void addAddress(Scanner reader, ContactBook contactBook) {
        System.out.println("whose address: ");
        String inputName = this.reader.nextLine();
        
        for(Contact c : contactBook.getContacts()) {
            if(!c.getName().equalsIgnoreCase(inputName)) {
                System.out.println("not found");
                return;
            }
        }
        
        System.out.println("street:");
        String inputStreet = this.reader.nextLine();
        
        System.out.println("city:");
        String inputCity = this.reader.nextLine();
        
        String address = inputStreet + " " + inputCity;
        
        List<String> addressList = new ArrayList<String>();
        
        for(Contact c : contactBook.getContacts()) {
            if(c.getName().equalsIgnoreCase(inputName)) {
                if(c.getAddress() == null) {
                    addressList.add(address);
                    c.addAddress(addressList);
                    return;
                } else {
                    addressList = c.getAddress();
                    addressList.add(address);
                    c.addAddress(addressList);
                    return;
                }
            }
        }
    }
    
    public void searchNumberAndAddress(String name, ContactBook contactBook) {
        
    }
    
    public void deleteNumberAndAddress(String name, ContactBook contactBook) {
        
    }
}
