package labs.apcs_CH4_lab_4;


/**
 *Creates a library (3 books) using both Book and Author
 */
public class Library
{
    // instance variables - replace the example below with your own
    private Book book1;
    private Book book2;
    private Book book3;
    private int numberOfBooks;

    /**
     * Constructor for objects of class Library
     */
    public Library()
    {
        // initialise instance variables
        numberOfBooks = 0;
        System.out.println("Enter information for first book");
        System.out.println("----------------------------------");
        book1 = new Book();
        numberOfBooks++;
        /*
        System.out.println("----------------------------------");
        System.out.println("Enter information for second book");
        System.out.println("----------------------------------");
        book2 = new Book();
        numberOfBooks++;
        System.out.println("----------------------------------");
        System.out.println("Enter information for third book");
        System.out.println("----------------------------------");
        book3 = new Book();
        numberOfBooks++;
        */
    }

    //getNumberOfBooks()
    public int getNumberOfBooks() {
        return numberOfBooks;
    }
    
    
    //listTitles()
    public String listTitles() {
        return "Titles: \n" + book1.getTitle() + "\n" + book2.getTitle() + "\n" + book3.getTitle();
    }
    
    //listAuthors()
    public String listAuthors() {
         return "Authors: \n" + book1.getAuthorName() + "\n" + book2.getAuthorName() + "\n" + book3.getAuthorName();
    }
    
    public String listPublishers() {
        return "Publishers: \n" + book1.getAuthor().getPublisher();
    }
    
    //toString()
    public String toString() {
        return listTitles() + "\n" + listAuthors();
    }
}
