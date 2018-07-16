/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Faraz
 */

import java.util.*;

public class Library {
    
    private ArrayList<Book> books;
    
    public Library() {
        this.books = new ArrayList<Book>();
    }
    
    public void addBook(Book book) {
        this.books.add(book);
    }
    
    public void printBooks() {
        for (Book print : books) {
            System.out.println(print);
        }
    }
    
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> titleMatch = new ArrayList<Book>();
        
        for (Book find : books) {
            if (StringUtils.included(find.title(), title)) {
                titleMatch.add(find);
            }
        }
        
        return titleMatch;
    }
    
    public ArrayList<Book> searchByPublisher(String Publisher) {
        ArrayList<Book> pubMatch = new ArrayList<Book>();
        
        for (Book found : books) {
            if (StringUtils.included(found.publisher(), Publisher)) {
                pubMatch.add(found);
            }
        }
        
        return pubMatch;
    }
    
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> yearMatch = new ArrayList<Book>();
        
        for (Book found : books) {
            if (found.year() == year) {
                yearMatch.add(found);
            }
        }
        
        return yearMatch;
    }
    
    
}
