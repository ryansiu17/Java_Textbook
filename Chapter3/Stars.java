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
            System.out.println("Please enter a length");
            star.buildShapeA(scan.nextInt());
        }
        if(choice.equals("B")){
            System.out.println("Please enter a length");
            star.buildShapeB(scan.nextInt());
        }    
        if(choice.equals("C")){
            System.out.println("Please enter a length");
            star.buildShapeC(scan.nextInt());
        }    
        if(choice.equals("D")){
            System.out.println("Please enter an ODD length");
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
        for (int i = 0; i < length; i++){
            for (int j = 0; j < length - i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public void buildShapeC(int length){
        for (int i = 0; i < length; i++){
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < length - i; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public void buildShapeD(int length){
        int stars = 1;
        for (int i = 0; i < ((length - 1)/2); i++){
            System.out.println("");
            for (int j = 0; (j < ((length - stars)/2)); j++){
                System.out.print(" ");
            }
            for (int k = 0; k < stars; k++ ){
                System.out.print("*");
            }
            stars += 2;
        }
        stars = length;
        for (int i = 0; i < ((length - 1)/ 2); i++){
            System.out.println("");
            for (int j = 0; (j < ((length - stars)/2)); j++){
                System.out.print(" ");
            }
            for (int k = 0; k < stars; k++ ){
                System.out.print("*");
            }
            stars -= 2;
        }
        System.out.println("");
        for(int g = 0; g < ((length - 1)/2); g++){
            System.out.print(" ");
        }
        System.out.print("*");
    }
}