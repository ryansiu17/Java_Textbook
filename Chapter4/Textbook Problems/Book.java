import java.util.Scanner;
public class Book{
    private String title;
    private String genre;
    private Author author;
    Scanner scan = new Scanner(System.in);
    public Book(){
        setTitle();
        setGenre();
        author = new Author();
    }
    public String getTitle(){
        return this.title;
    }
    public String getGenre(){
        return this.genre;
    }
    public void setGenre(){
        System.out.println("Enter Genre");
        genre = scan.next();       
    }
    public void setTitle(){
        System.out.println("Enter Title");
        title = scan.next();        
    }
    public String toString(){
        return title + ", written by " + author; 
    }
}