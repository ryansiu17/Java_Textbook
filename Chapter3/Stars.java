import java.util.Scanner;
public class Stars{
    public static void main(String args[]){
        Stars star = new Stars();
        Scanner scan = new Scanner(System.in);
        System.out.println("Which Shape Would You Like To Build? \n Please enter \"A\", \"B\", \"C\", or \"D\" ");
        String choice = new String();
        choice = scan.next();
        choice.toUpperCase();
        
        if(choice.equals("A")){
            star.buildShapeA(scan.nextInt());
        }
        if(choice.equals("B")){
            star.buildShapeB(scan.nextInt());
        }    
        if(choice.equals("C")){
            star.buildShapeC(scan.nextInt());
        }    
        if(choice.equals("D")){
            star.buildShapeD(scan.nextInt());
        }    
    
    
    }
    public void buildShapeA(int length){
        int runs = length;
        for(int i = 0; i < runs; i++){
            for(int j = 0; j < length; j++){
                System.out.print("*");
            }
            System.out.print("\n");
            length--;
        }
    }
    public void buildShapeB(int length){
    }
    public void buildShapeC(int length){
    }
    public void buildShapeD(int length){
    }
}