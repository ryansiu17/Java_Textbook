// ****************************************************************
// Square.java
//
// Define a Square class with methods to create and read in
// info for a square matrix and to compute the sum of a row,
// a col, either diagonal, and whether it is magic.
//          
// ****************************************************************
import java.util.Scanner;
public class Square
{
    int[][] square;
   
    //--------------------------------------
    //create new square of given size
    //--------------------------------------
    public Square()
    {
        
    }
    //--------------------------------------
    //return the sum of the values in the given row
    //--------------------------------------
    public int sumRow(int row)
    {
        int sum = 0;
        for(int col = 0; col < this.square[0].length; col++){
            sum += this.square[row][col];
        }
        return sum;
    }
    //--------------------------------------
    //return the sum of the values in the given column
    //--------------------------------------
    public int sumCol(int col)
    {
        int sum = 0;
        for(int row = 0; row < this.square.length; row++){
            sum += this.square[row][col];
        }
        return sum;
    }
    //--------------------------------------
    //return the sum of the values in the main diagonal
    //--------------------------------------
    public int sumMainDiag()
    {
        int sum = 0;
        for(int row = 0; row < this.square.length; row++){
            sum += this.square[row][row];
        }
        return sum;
    }
    //--------------------------------------
    //return the sum of the values in the other ("reverse") diagonal
    //--------------------------------------
    public int sumOtherDiag()
    {
        int sum = 0;
        for(int row = 0; row < this.square.length; row++){
            sum += this.square[this.square.length - 1 - row][row];
        }
        return sum;
    }
    //--------------------------------------
    //return true if the square is magic (all rows, cols, and diags have
    //same sum), false otherwise
    //--------------------------------------
    public boolean magic()
    {
        //Change to work correctly
        int sum = 0;
        for(int row = 0; row < this.square.length; row++){
            sum += this.sumRow(row);
        }
        if(sum/this.square.length == sumRow(0)){
            //System.out.print("Past level 1");
            sum = 0;
            for(int col = 0; col < this.square[0].length; col++){
                sum += this.sumCol(col);
            }
                if(sum/this.square[0].length == this.sumCol(0)){
                    //System.out.print("Past level 2");
                    if (this.sumMainDiag() == this.sumOtherDiag()){
                        //System.out.print("Past level 3");                        
                        if (sum/this.square[0].length == this.sumMainDiag()){
                            //System.out.print("Past level 4");   
                            return true;
                        }
                    }
                }            
        }    
        return false;
    }
    //--------------------------------------
    //read info into the square from the standard input.
    //--------------------------------------
     public void setSquare(int[][] sq)
    {
        this.square = sq;
    }
   
    //--------------------------------------
    //print the contents of the square, neatly formatted
    //--------------------------------------
    public void printSquare()
    {
        for(int row = 0; row < square.length; row++) {
            for(int col =0; col < square[0].length; col++) {
                System.out.print(square[row][col] + "\t");
            }
            System.out.println();
        }
     }
}