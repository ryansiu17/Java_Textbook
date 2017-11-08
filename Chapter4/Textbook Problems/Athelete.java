import java.util.Scanner;
public class Athelete{
    private String name;
    private int age;
    Scanner scan = new Scanner(System.in);
    public Athelete(){
        System.out.println("Enter Athelete's Name");
        this.name = scan.next();
        System.out.println("Enter Athelete's Age");
        this.age = scan.nextInt();
    }
    public String toString(){
        return ("Player " + this.name + ", aged " + this.age + ".");
    }
}