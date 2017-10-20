// ****************************************************************
//   Guess.java
//
//   Play a game where the user guesses a number from 1 to 10
//              
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
 
public class Guess
{
    public static void main(String[] args)
        {
          Guess guesser = new Guess();
          int numToGuess;           //Number the user tries to guess
          int guess;                //The user's guess
 
          Scanner scan = new Scanner(System.in);
 
          //randomly generate the  number to guess
          numToGuess = guesser.generateRandom();
          //print message asking user to enter a guess
          System.out.println("Guess a number between 1 and 10: ");
          //read in guess
          guess = guesser.takeGuess();
          while (guess != numToGuess)  //keep going as long as the guess is wrong
            {
                  //print message saying guess is wrong
                  System.out.println("You guessed " + guess + ", try again");
                  //get another guess from the user
                  guess = guesser.takeGuess();
          }
          System.out.println("You guessed: " + guess + ", and the number was: " + numToGuess);
          //print message saying guess is right
        }
    public int generateRandom(){
        Random generator = new Random();
        return generator.nextInt(10) + 1;
    }
    public int takeGuess(){
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
}
 