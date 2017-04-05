
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sameerkhan
 */
public class Phonebook {
    private  ArrayList<Person> newPerson;
    
    public Phonebook() {
        this.newPerson = new ArrayList<Person>();
    }
    
    public void add(String name, String number) {
        Person newname = new Person(name, number);
        this.newPerson.add(newname);
    }
    
    public String searchNumber(String name) {
        String result = "";
        for (Person newone : newPerson) {
            if(newone.getName().equals(name)) {
                return newone.getNumber();
            } else {
                result = "number not known";
            }
        }
        return result;
    }
    
    public void printAll() {
        for(Person newone : newPerson) {
            System.out.println(newone.getName() + "  number: " + newone.getNumber());
        }
    }
    
}
