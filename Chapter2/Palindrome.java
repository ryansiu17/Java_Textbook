
public class Palindrome
{
    // instance variables - replace the example below with your own
    String word;
    boolean isPalindrome;

   public Palindrome(String wd)
   {
        // initialise instance variables
        this.word = wd;
   }
   public boolean testPalindrome(){
       String backwards = "";
       for(int i = 0; i < word.length(); i++){
           System.out.println(word.substring(i, i+1));
       }
       System.out.println("\n");
       for(int j = word.length(); j > 0; j--){
           System.out.println(word.substring(j-1, j));
           backwards += word.substring(j-1, j);
       }
       
       // inclusive start, non inclusive end. racecar.substring(2,3) will give "c" 
       isPalindrome = word.equals(backwards);
       return isPalindrome;
   }
}
