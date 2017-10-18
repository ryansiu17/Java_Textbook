public class PalindromeDriver{

   public static void main(String args[])
   {
       Palindrome pablo = new Palindrome("yobananaboys");
       pablo.testPalindrome();
       System.out.println("#==------==------==------==------==------==#");
       System.out.println("The word: " + pablo.word);
       System.out.println("is a Palindrome: " + pablo.isPalindrome);
       System.out.println("#==------==------==------==------==------==#");
   }

}