import java.util.Scanner;
public class Library{
    private String name;
    private Book[] books;
    private int numberBooks;
    Scanner scan = new Scanner(System.in);
    public Library(int size, String nm){
        this.books = new Book[size];
        this.name = nm;
    }
    public String toString(){
        String output = "This Library has: \n";
        for (Book b : books){
            output += b + "\n";
        }
        return output;
    }
    public void addBook(Book b, int i){
        books[i] = b;        
    }
    public void addBook(){
        System.out.println("Where to add new book");
        int i = scan.nextInt();
        Book b = new Book();
        books[i] = b;        
    }
}