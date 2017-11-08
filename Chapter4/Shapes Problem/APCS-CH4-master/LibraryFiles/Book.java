package labs.apcs_CH4_lab_4;

import java.util.Scanner;

/**
 *Book uses the Author class and fits within a given genre
 */
public class Book
{
    // instance variables - replace the example below with your own
    private Author author;
    private String title;
    private int numberOfPages;
    private String genre;  //Mystery, SciFi, Romance, Adventure
    Scanner scan = new Scanner(System.in);

    /**
     * Constructor for objects of class Book
     */
    public Book()
    {
        // initialise instance variables
        System.out.println("Enter Author first name: ");
        String first = scan.nextLine();
        System.out.println("Enter Author last name: ");
        String last = scan.nextLine();
        author = new Author(first, last);
        setTitle();
        setGenre();
        setPages();
    }

    //Create 'setters'
    public void setTitle() {
        System.out.println("Enter Book title: ");
        title = scan.nextLine();
    }
    
    public void setGenre() {
        System.out.println("Enter Genre:" );
        genre = scan.nextLine();
    }
    
    public void setPages() {
        System.out.println("Enter number of pages");
        numberOfPages = scan.nextInt();
    }
    
    //Create 'getters'
    public Author getAuthor() {
        return author;
    }
    
    public String getAuthorName() {
        return author.getName();
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public String getGenre() {
        return this.genre;
    }
    
    public int getPages() {
        return this.numberOfPages;
    }
    
    //Create toString() method
    public String toString() {
        String output;
        output = "Book Title: " + getTitle() + "\tBook Author: " + getAuthor() + "\tGenre: " + getGenre() + "\tNumber of Pages: " + getPages();
        return output;
    }
}
