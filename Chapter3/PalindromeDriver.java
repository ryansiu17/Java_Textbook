import java.util.Scanner; 
public class PalindromeDriver{

   public static void main(String args[])
   {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the Palindrome to test");
       Palindrome pablo = new Palindrome(scan.next());
       pablo.testPalindrome();
       System.out.println("#==------==------==------==------==------==#");
       System.out.println("The word: " + pablo.word);
       System.out.println("is a Palindrome: " + pablo.isPalindrome);
       System.out.println("#==------==------==------==------==------==#");
   }

}