// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
public class Rock
{
    public static void main(String[] args)
    {
        Rock game = new Rock();
        String personPlay;    //User's play -- "R", "P", or "S"
        String computerPlay;  //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number used to determine
                              //computer's play
        //Get player's play -- note that this is stored as a string
        personPlay = game.getPlayerPlay();
        //Make player's play uppercase for ease of comparison
        //Generate computer's play (0,1,2)
        //Translate computer's randomly generated play to string
        computerPlay = game.getComputerPlay();
        //Print computer's play
        System.out.println("---------------=====================--------------");
        System.out.println("You Played: " + personPlay);
        System.out.println("CPU Played: " + computerPlay);
        System.out.println("---------------=====================--------------");        
        //See who won.
        game.determineWinner(personPlay, computerPlay);
    }
    public String getPlayerPlay(){
        Scanner player = new Scanner(System.in);
        System.out.println("---------------=====================--------------");
        System.out.println("Enter R for Rock, P for Paper, or S for Scissors: ");
        System.out.println("---------------=====================--------------");
        String playerPlay = player.next(); 
        playerPlay.toUpperCase();
        if (!((playerPlay.equals("R")) || (playerPlay.equals("P")) || (playerPlay.equals("S")))){
            while(!((playerPlay.equals("R")) || (playerPlay.equals("P")) || (playerPlay.equals("S")))){
                System.out.println("---------------=====================--------------");
                System.out.println("Please enter an R, S, or P:                       ");
                System.out.println("---------------=====================--------------");
                playerPlay = player.next();
            }
        }
        return playerPlay;
    }
    public String getComputerPlay(){
        Random generator = new Random();
        String cpuPlay = new String();
        int computerPlayInt = generator.nextInt(3) + 1;
        if (computerPlayInt == 1){
            cpuPlay = "R";
        }
        else if (computerPlayInt == 2){
            cpuPlay = "P";
        }
        else if (computerPlayInt == 3){
            cpuPlay = "S";
        }
        return cpuPlay;
    }
    public void determineWinner(String pPlay,String cPlay){
        if (pPlay.equals("P")){
            if (cPlay.equals("P")){
                System.out.println("That's a Tie!");
            }
            else if (cPlay.equals("R")){
                System.out.println("You Won!");
            }
            else if (cPlay.equals("S")){
                System.out.println("You Lost!");
            }
        }
        else if (pPlay.equals("R")){
            if (cPlay.equals("R")){
                System.out.println("That's a Tie!");
            }
            else if (cPlay.equals("S")){
                System.out.println("You Won!");
            }
            else if (cPlay.equals("P")){
                System.out.println("You Lost!");
            }
        }
        else if (pPlay.equals("S")){
            if (cPlay.equals("S")){
                System.out.println("That's a Tie!");
            }
            else if (cPlay.equals("P")){
                System.out.println("You Won!");
            }
            else if (cPlay.equals("R")){
                System.out.println("You Lost!");
            }
        }        
    }
}
