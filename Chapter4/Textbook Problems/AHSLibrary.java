import java.util.Scanner;
public class AHSLibrary{
    Scanner scan = new Scanner(System.in);
    public static void main(String args[]){
        Library ahs = new Library(10, "Acalanes");
        System.out.println(ahs);
        ahs.addBook();
        ahs.addBook();
        ahs.addBook();
        System.out.println(ahs);
    }
}