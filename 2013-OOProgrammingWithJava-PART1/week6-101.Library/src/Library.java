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
public class Library {
    private ArrayList<Book> newBooks;
    
    public Library() {
        this.newBooks = new ArrayList<Book>();
    }
    
    public void addBook(Book newBook) {
        this.newBooks.add(newBook);
    }
    
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book item : this.newBooks) {
            if(StringUtils.included(item.title(), title)) {
                found.add(item);
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book item : this.newBooks) {
            if(StringUtils.included(item.publisher(), publisher)) {
                found.add(item);
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book item : this.newBooks) {
            if(item.year() == year) {
                found.add(item);
            }
        }
        return found;
    }
    
    public void printBooks() {
        for(Book item : this.newBooks) {
            System.out.println(item.toString());
        }
    }
}