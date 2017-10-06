
// *******************************************************************
//   PlusTest.java
//
//   Demonstrate the different behaviors of the + operator
// *******************************************************************
public class PlusTest
{
        // -------------------------------------------------
        // main prints some expressions using the + operator
        // -------------------------------------------------
        public static void main (String[] args)
        {
         System.out.println ("This is a long string that is the " +
                                 "concatenation of two shorter strings.");
                                 // Gonna be one line
         System.out.println ("The first computer was invented about" + 55 +
                                 "years ago.");
                                 // Gonna be one line, gonna have numbers as a string
         System.out.println ("8 plus 5 is " + 8 + 5);
                                   // Gonna be 85
         System.out.println ("8 plus 5 is " + (8 + 5));
                                // Gonna be 13
         System.out.println (8 + 5 + " equals 8 plus 5.");
         // Also gonna be 13
        }
}
