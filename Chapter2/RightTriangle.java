import java.util.Scanner;
// *******************************************************************
//   RightTriangle.java
//
//   Compute the length of the hypotenuse of a right triangle
//   given the lengths of the sides         
// *******************************************************************
 
public class RightTriangle
{
   public static void main (String[] args)
   {
          Scanner keyboard = new Scanner(System.in);
          double side1, side2;  // lengths of the sides of a right triangle
          double hypotenuse;        // length of the hypotenuse
 
          // Get the lengths of the sides as input
          System.out.print ("Please enter the length of the side of a right triangle");
        side1 = keyboard.nextDouble();
        
        side2 = keyboard.nextDouble();
     
 
          // Compute the length of the hypotenuse
 
         hypotenuse = Math.sqrt((side1*side1) + (side2*side2));
 
          // Print the result
          System.out.println ("Length of the hypotenuse: " + hypotenuse);
        }
}
 

