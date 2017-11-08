package labs.apcs_CH4_lab_4;
import java.util.Scanner;


/**
 * Write a description of class Author here.
 */
public class Author
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String lastName;
    private int bookNumber; //how many books has this author written
    private String publisher;
    Scanner scan = new Scanner(System.in);

    /**
     * Constructor for objects of class Author
     */
    public Author(String first, String last)
    {
        // initialise instance variables
        this.firstName = first;
        this.lastName = last;
        setBookNumber();
        setPublisher();
    }
    
    //Create 'setters' below
    public void setBookNumber() {
        System.out.println("How many books has this author written");
        bookNumber = scan.nextInt();
    }
    
    public void setPublisher() {
        System.out.println("Enter name of publisher:");
        publisher = scan.nextLine();
    }
    
    //Create 'getters' below
    public String getName() {
        return this.firstName + " ," + this.lastName;
    }
    
    public int getBookNumber() {
        return this.bookNumber;
    }
    
    public String getPublisher() {
        return this.publisher;
    }

    //Create toString() method below
    public String toString() {
        return "Author: " + getName() + "\tPublisher: " + getPublisher();
    }
}
