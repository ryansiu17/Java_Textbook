import java.util.Scanner;
public class Author{
    Scanner scan = new Scanner(System.in);
    private String first;
    private String last;
    private int booksPublished;
    public Author(){
        System.out.println("Enter Author's First Name");
        this.first = scan.next();
        System.out.println("Enter Author's Last Name");
        this.last = scan.next();    
        setBooksPublished();
    }
    public String getName(){
        return this.first + " " + this.last;
    }
    public String toString(){
        return "Author: " + this.first + this.last + ", With " + this.booksPublished + " Books Published";
    }
    public void setBooksPublished(){
        System.out.println("How many books has this author published?");
        this.booksPublished = scan.nextInt();
    }
    public int getBooksPublished(){
        return this.booksPublished;
    }
}