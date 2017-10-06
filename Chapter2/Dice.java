import java.util.Random;

public class Dice
{
    public static void main() 
    {
        Random diceRandom = new Random();
        int dice1 = diceRandom.nextInt(5) + 1;
        int dice2 = diceRandom.nextInt(5) + 1;
        int diceTotal = dice1 + dice2;
        System.out.print("Dice 1 Rolled a: " + dice1 + "\n" + "Dice 2 Rolled a: " + dice2 + "\n" + "The Total is: " + diceTotal);
    }
}